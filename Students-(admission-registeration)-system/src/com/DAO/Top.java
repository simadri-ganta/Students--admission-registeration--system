package com.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Top extends Connection{
	public ResultSet getlist() throws SQLException {
		
		Statement st=this.con.createStatement();
		
		ResultSet rs=st.executeQuery("select * from applications_table order by percenatge");
		
		return rs;
		
		
		
		
	}

}
