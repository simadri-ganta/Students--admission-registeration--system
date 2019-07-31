package com.Business.logic;

import java.sql.SQLException;

import com.DAO.select_students;

public class entry_to_depart {
	public int check_and_allot(String department_choice,String name,String percentage) throws SQLException{
		Store_data ob=new Store_data();
		System.out.println("your application in progress");
		char li[]= {'c','e','i','m'};
		char[] li1 = new char[5];
		System.out.println(department_choice);
		
		switch(department_choice) {
		case "cse":
			li1[0]='c';
			break;
		case "ece":
			li1[0]='e';
			break;
		case "t":
			li1[0]='i';
			break;
		case "mechanical":
			
			li1[0]='m';
			break;
			
		}
		for(int j=1,k=0;k<4;k++)
		{
			
			if(li1[0]!=li[k]) {
				li1[j++]=li[k];
			}
		}
		li1[4]='d';
		int k=0;
		System.out.println(li1);
		String t=new allotseat().get_seat(name,percentage,li1);
		if(t!=null) {
			ob.setalloted_dept(t);
			new select_students().insert_data();
			k=1;
			
		}
		return k;
		
	}

}
