package com.DAO;

import java.sql.DriverManager;
import java.sql.SQLException;


public class Connection {
	static java.sql.Connection con;

	public void establishConnection() throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.cj.jdbc.Driver");
		this.con=DriverManager.getConnection("jdbc:mysql://localhost:3306/simadri","root","root");
		System.out.println("connection established");
	}

}
