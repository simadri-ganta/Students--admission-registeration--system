package com.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Order_by_list extends Connection {
	public ResultSet getorderlist() throws SQLException{
		Statement st=this.con.createStatement();
		ResultSet rs=st.executeQuery("select name,percenatge,depart_choice from applications_table order by percenatge");
		return rs;
		
	}

}
