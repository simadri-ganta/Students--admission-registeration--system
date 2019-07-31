package com.Business.logic;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.DAO.application_list;

public class application_list_logic {

	
	
	
	public void get_application_list() throws SQLException {
		
		ResultSet rs=new application_list().getList();//getting resultset object form DAO
		ArrayList<String> list=new ArrayList();
		System.out.println(list);
		while(rs.next()) {
			for(int i=1;i<=8;i++) {
			list.add(rs.getString(i));
			}
		}
		new Store_data().set_application_list(list);//setting the list into beanclass
		
		
		
	}

}
