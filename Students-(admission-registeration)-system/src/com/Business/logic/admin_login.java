package com.Business.logic;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.DAO.Admin_val;

public class admin_login {
	public boolean validate() throws SQLException, ClassNotFoundException {
		int i=0;
		System.out.println("validate()");
		ResultSet rs=new Admin_val().validating();
		System.out.println("rs back");
		System.out.println(new Store_data().getuser()+" "+new Store_data().getpass());
		while(rs.next()) {
			System.out.println("checking");
			if(new Store_data().getuser().equals(rs.getString(1))&&new Store_data().getpass().equals(rs.getString(2))) {
				i=99;
				System.out.println("avail");
				break;
			}
		}
		
		if(i==99)
			return true;
		else
			return false;
	}

}
