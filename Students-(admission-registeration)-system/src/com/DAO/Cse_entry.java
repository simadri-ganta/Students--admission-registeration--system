package com.DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Cse_entry extends Connection{
	public boolean allot(String name,String percentage) throws SQLException {
		int i=0;
		PreparedStatement ps=this.con.prepareStatement("insert into cse values(?,?)");
		ps.setString(1, name);
		ps.setString(2, percentage);
		i=ps.executeUpdate();
		System.out.println("csegot");
		if(i==1) {
			return true;
		}
		else
		return false;
		
		
	}

}
