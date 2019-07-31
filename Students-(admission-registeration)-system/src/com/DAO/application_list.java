package com.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class application_list extends Connection {
	public ResultSet getList() throws SQLException{
		Statement st=this.con.createStatement();
		ResultSet rs=st.executeQuery("select * from applications_table");
		
		return rs;	
	}

}
