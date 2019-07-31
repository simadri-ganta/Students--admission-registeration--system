package com.DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.Business.logic.Store_data;

public class select_students extends Connection {

	public void insert_data() throws SQLException {
		
		System.out.println("");
		int i=0;
		Store_data data=new Store_data();
		try {
		PreparedStatement ps=this.con.prepareStatement("insert into selected_students(name,board,marks,gpa,percenatge,school,depart_choice,alloted_dept) values(?,?,?,?,?,?,?,?)");
		ps.setString(1,data.getname());
		ps.setString(2,data.getboard());
		ps.setString(3,data.getmarks());
		ps.setString(4,data.getgpa());
		ps.setString(5,data.getpercentage());
		ps.setString(6,data.getschool());
		ps.setString(7,data.getdepartment());
		ps.setString(8,data.getalloted_dept());
		i=ps.executeUpdate();
		
		
		}catch(Exception e) {
			System.out.println(e);
		}
	
	
		
		
	}

}
