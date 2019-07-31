package com.Business.logic;

import java.io.PrintStream;
import java.util.ArrayList;

public class Store_data { 
	static String user,alloted_dept;
	static ArrayList<String> list;
    public void set_user(String user1) { 
    	user = user1;
    System.out.println("userset" + user); }
  
  static String pass;
  
  public void set_pass(String pass1) { pass = pass1;
    System.out.println("passset" + pass); }
  
  
  public String getuser() { System.out.println("getuser" + user);
    return user; }
  
  static String totalmarks;
  
  public String getpass() { System.out.println("getpass" + pass);
    return pass; }
  
  
  static String name,board,percentage,gpa,school,department_choice;
  
  public void set_newapplication(String name, String board, String totalmarks, String gpa, String percentage, String school, String department_choice) {
	  System.out.println("setted data");
    this.name = name;
    this.board = board;
    this.totalmarks = totalmarks;
    this.gpa = gpa;
    this.percentage = percentage;
    this.school = school;
    this.department_choice = department_choice;
    System.out.println("servlet"+this.getname()+this.board+this.totalmarks+this.gpa+this.percentage+this.school+this.department_choice); 
    }
  
  
  public String getname() { 
	  System.out.println(this.name);
    return this.name;
  }
  
  public String getboard() { 
	  
	  System.out.println(this.board);
    return board; }
  
  public String getmarks() { System.out.println(this.totalmarks);
    return totalmarks; }
  
  public String getgpa() { System.out.println(this.gpa);
    return gpa; }
  
  public String getpercentage() { System.out.println(this.percentage);
    return percentage; }
  
  public String getschool() { System.out.println(this.school);
    return school; }
  
  public String getdepartment() { System.out.println(this.department_choice);
    return department_choice;
  }


public void set_application_list(ArrayList<String> list) {
	this.list=list;
	
}
public ArrayList<String> getlist(){
	return this.list;
	
}
public void setalloted_dept(String alloted) {
	// TODO Auto-generated method stub
	this.alloted_dept=alloted;
}

public String getalloted_dept() {
// TODO Auto-generated method stub
	return alloted_dept;
}
}
