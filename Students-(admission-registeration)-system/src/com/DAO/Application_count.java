package com.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Application_count extends Connection {
	public int getcount() throws SQLException {
		Statement st=this.con.createStatement();
		ResultSet rs=st.executeQuery("select count(*) from applications_table");
		rs.next();
		int i=Integer.parseInt(rs.getString(1));
		return i;
		
	}

}
