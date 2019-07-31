package com.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Depart_wise_list extends Connection {
	
	
	public ResultSet cse() throws SQLException {
		
		ResultSet rs =this.con.createStatement().executeQuery("select * from cse;");
		return rs;
	}
	
	
	
	public ResultSet ece() throws SQLException {
		ResultSet rs1 =this.con.createStatement().executeQuery("select * from ece;");
		return rs1;
		
		
		
	}
	public ResultSet It() throws SQLException {
		
		ResultSet rs2 =this.con.createStatement().executeQuery("select * from It;");
		return rs2;
		
		
	}
	public ResultSet mech() throws SQLException {
		
	ResultSet rs3 =this.con.createStatement().executeQuery("select * from mechanical;");
		
		return rs3;
	}

}
