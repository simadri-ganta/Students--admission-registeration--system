package com.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Depart_count extends Connection {
	public ResultSet count_cse() throws SQLException{
		Statement st=this.con.createStatement();
		ResultSet rs=st.executeQuery("select count(name) from cse");
		return rs;
		
		
	}
	public ResultSet count_ece() throws SQLException{
		Statement st=this.con.createStatement();
		ResultSet rs=st.executeQuery("select count(name) from ece");
		return rs;
		
		
	}
	public ResultSet count_It() throws SQLException{
		Statement st=this.con.createStatement();
		ResultSet rs=st.executeQuery("select count(name) from It");
		return rs;
		
		
	}
	public ResultSet count_mechanical() throws SQLException{
		Statement st=this.con.createStatement();
		ResultSet rs=st.executeQuery("select count(name) from mechanical");
		return rs;
		
		
	}

}
