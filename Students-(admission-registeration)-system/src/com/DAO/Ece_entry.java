package com.DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Ece_entry extends Connection{

	public boolean allot(String name, String percent) throws SQLException {
	
		int i=0;
		PreparedStatement ps=this.con.prepareStatement("insert into ece values(?,?)");
		ps.setString(1, name);
		ps.setString(2, percent);
		i=ps.executeUpdate();
		System.out.println("ecegot");
		if(i==1) {
			return true;
		}
		else
		return false;
		
	}

}
