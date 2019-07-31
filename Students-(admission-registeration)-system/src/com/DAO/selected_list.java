package com.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class selected_list extends Connection {
	public ResultSet getlist() throws SQLException{
		Statement st=this.con.createStatement();
		
		ResultSet rs=st.executeQuery("select * from selected_students");
		
		return rs;
		
	}

}
