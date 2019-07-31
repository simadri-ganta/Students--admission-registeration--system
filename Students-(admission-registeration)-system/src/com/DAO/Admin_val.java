package com.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Admin_val extends Connection{
	public ResultSet validating() throws SQLException, ClassNotFoundException{
		System.out.println("validating");
		Statement ps=this.con.createStatement();
		ResultSet rs=ps.executeQuery("select username,password from admin_users");
	
		return rs;
		
		
	}

}
