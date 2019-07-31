package com.Business.logic;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.DAO.Connection;
import com.DAO.Cse_entry;
import com.DAO.Depart_count;
import com.DAO.Ece_entry;
import com.DAO.It_entry;
import com.DAO.mechanical_entry;

public class allotseat extends Connection {
	static int cse,ece,It,mechanical,p=1;
			String name,percent;
	char[] li;
	public String get_seat(String name, String percentage, char[] li1) throws SQLException {
		System.out.println("alloteseats");
		this.li=li1;
		this.name=name;
		this.percent=percentage;
		
		

		char department_choice=li1[0];
		
		Depart_count depart=new Depart_count();
		System.out.println("alloteseats");
		ResultSet rs=depart.count_cse();
		rs.next();
		this.cse=rs.getInt(1);
		System.out.println("alloteseats");
		ResultSet rs1=depart.count_ece();
		rs1.next();
		this.ece=rs1.getInt(1);
		System.out.println("alloteseats");
		ResultSet rs2=depart.count_It();
		rs2.next();
		this.It=rs2.getInt(1);
		System.out.println("alloteseats");
		ResultSet rs3=depart.count_mechanical();
		rs3.next();
		this.mechanical=rs3.getInt(1);
		System.out.println("alloteseats");
		System.out.println(cse+""+ece+""+It+""+mechanical);
		
		String i=meth(department_choice);
		return i;

		}
		

	
	public String meth(char department_choice ) throws SQLException {

		switch(department_choice) {
		case 'c':
		{
			if(this.cse<5) {
				
				boolean k=new Cse_entry().allot(name, percent);
				if(k) {
					System.out.println("you are alloted to cse department");
					return "cse";
				}
				break;
				
			}
			else {
				
				department_choice=li[p++];
				meth(department_choice);
			}
		}
		case 'e':
		{
			if(this.ece<5) {
				System.out.println("ece");
				boolean k=new Ece_entry().allot(name, percent);
				if(k) {
					
					System.out.println("you are alloted to ece department");
					return "ece";
				}

				break;
			}
			else {
				department_choice=li[p++];//try all other
				meth(department_choice);
				
			}
		}
		case 'i':
		{
			if(this.It<5) {
				System.out.println("it");
				boolean k=new It_entry().allot(name, percent);
				if(k) {
					System.out.println("you are alloted to it department");
					return "it";
				}

				break;
			}
			else {
				department_choice=li[p++];//try all other
				meth(department_choice);
			}
		}
		case 'm':
		{
			if(this.mechanical<5) {
				System.out.println("mech");
				boolean k=new mechanical_entry().allot(name, percent);
				if(k) {
					System.out.println("you are alloted to mechanical department");
					return "mechanical";
				}

				break;
			}
			else{
				department_choice=li[p++];//try all other
				meth(department_choice);
			}
		}
		case 'd':
			break;
		
		
		
		}
		return null;
		
	}
}
