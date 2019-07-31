package com.Controller;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Business.logic.Store_data;
import com.Business.logic.admin_login;
import com.Business.logic.entry_to_depart;
import com.DAO.Connection;
import com.DAO.Order_by_list;
import com.DAO.applications_table;

//@WebServlet("/parent-control")
@WebServlet(urlPatterns={"/parent-control", "/adminOper/parent-control"})
public class Controller_servlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			new Connection().establishConnection();
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		PrintWriter out=response.getWriter();
		HttpSession session=request.getSession();
		System.out.println("servlet");
		Store_data ob=new Store_data();
		
		switch(request.getParameter("choice")) {
		case "login":
				try {
					String user=request.getParameter("username");
					String pass=request.getParameter("password");
					ob.set_user(user);
					ob.set_pass(pass);
					boolean i=new admin_login().validate();
					if(i) {
						session.setAttribute("security_status", "true");
						response.sendRedirect("adminOper/admin_home.jsp");
					}
					else {
						session.setAttribute("name", "wrong");
						response.sendRedirect("admin_and_link.jsp");
					}
	
				}catch(Exception e) {
					out.println("error "+e);
					}
				break;
				
				
				
		case "newapplication":{
			System.out.println("servlet2");

			try {
			String name=request.getParameter("name");
			String board=request.getParameter("board");
			String totalmarks=request.getParameter("marks");
			String gpa=request.getParameter("gpa");
			String percentage=request.getParameter("percentage");
			
			
			int percent=Integer.parseInt(percentage)+0;
			
			
			String school=request.getParameter("school");
			String department_choice=request.getParameter("department");
			if(name==null) {
				session.setAttribute("status","true");
				response.sendRedirect("newadmissionform.jsp");
			
			}
			ob.set_newapplication(name, board, totalmarks, gpa, percentage, school, department_choice);
				
				if(percent>90) 
				
				{
				int i=new entry_to_depart().check_and_allot(department_choice, name, percentage);
				out.println("your are likely to be get seat");
					
				}
			
				else {
					System.out.println("else");
					new applications_table().insert_data();
				}
			
			
			}catch(Exception e) {
				
			}
			break;
			
		}
		case "confirm":
		{
			try {
				int k=0;
				ResultSet rs=new Order_by_list().getorderlist();
				ArrayList<String> list=new ArrayList();
				while(rs.next()) {
					String name=rs.getString(1);
					String percentage=rs.getString(2);
					String department_choice=rs.getString(3);
					
					int i=new entry_to_depart().check_and_allot(department_choice, name, percentage);
					if(i==1) {
						k++;
					}
					else
						break;
						
						
						
					
				}
				out.println("total "+k+" students now got seats");
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		}
		
			
		
		}//switch close
	}

}
