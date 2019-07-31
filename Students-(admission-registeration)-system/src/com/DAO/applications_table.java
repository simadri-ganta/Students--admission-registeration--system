package com.DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.Business.logic.Store_data;

public class applications_table extends Connection {
	Store_data data=new Store_data();

	public boolean insert_data() throws SQLException {
		System.out.println("servlet appl"+data.getname()+data.getpercentage());
		int i=0;
		try {
		PreparedStatement ps=this.con.prepareStatement("insert into applications_table(name,board,marks,gpa,percenatge,school,depart_choice) values(?,?,?,?,?,?,?)");
		ps.setString(1,data.getname());
		ps.setString(2,data.getboard());
		ps.setString(3,data.getmarks());
		ps.setString(4,data.getgpa());
		ps.setString(5,data.getpercentage());
		ps.setString(6,data.getschool());
		ps.setString(7,data.getdepartment());
		i=ps.executeUpdate();
		
		}catch(NullPointerException e) {
			System.out.println(e);
		}
		if(i==1)
			return true;
		else
			return false;
		
		
	}

}
