<%@ page  import="com.DAO.Depart_wise_list,java.sql.*,java.util.Iterator,com.Business.logic.application_list_logic,com.Business.logic.Store_data,com.DAO.Connection,java.util.ArrayList" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
h1{
color:white;

}
table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 60%;
}
body{
background-color:#595959;
}
td, th {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
}

tr:nth-child(even) {
  background-color: #dddddd;
}
tr:nth-child(odd) {
  background-color: #F3F5D5;
}
th{
background-color: #BBBE6B;

}
</style>
</head>
<body>
<H1>CSE department</H1>
<%

try{

ResultSet i=new Depart_wise_list().cse();
int k=0;
%><table><%
%>
<tr>
<th>SERIAL NO</th>
<th>NAME</th>
<th>BOARD</th>
</tr>


<%
int j=1;
while(i.next()){
	%>
	
	<tr> <td><%out.println(j++);%></td>
	<td><%out.println(i.getString(1)); %></td>
	<td><%out.println(i.getString(2)); %></td>
	</tr>
<%
	
}
}catch(Exception e){
	out.println(e);
}

%></table>



<table>
<H1>ECE department</H1>
<%

try{
ResultSet i1=new Depart_wise_list().ece();
int k=0;

%>
<tr>
<th>SERIAL NO</th>
<th>NAME</th>
<th>BOARD</th>
</tr>


<%
int j=1;
while(i1.next()){
	%>
	
	<tr> <td><%out.println(j++);%></td>
	<td><%out.println(i1.getString(1)); %></td>
	<td><%out.println(i1.getString(2)); %></td>
	
<%
	
}
}catch(Exception e){
	out.println(e);
}
%>



</table>



<table>

<H1>It department</H1>
<%

try{
new Connection().establishConnection();
ResultSet i2=new Depart_wise_list().It();
int k=0;

%>
<tr>
<th>SERIAL NO</th>
<th>NAME</th>
<th>BOARD</th>
</tr>


<%
int j=1;
while(i2.next()){
	%>
	
	<tr> <td><%out.println(j++);%></td>
	<td><%out.println(i2.getString(1)); %></td>
	<td><%out.println(i2.getString(2)); %></td>
	
<%
	
}
}catch(Exception e){
	out.println(e);
}
%>


</table>



<table>

<H1>mechanical department</H1>
<%

try{
new Connection().establishConnection();
ResultSet i3=new Depart_wise_list().mech();
int k=0;

%>
<tr>
<th>SERIAL NO</th>
<th>NAME</th>
<th>BOARD</th>
</tr>


<%
int j=1;
while(i3.next()){
	%>
	
	<tr> <td><%out.println(j++);%></td>
	<td><%out.println(i3.getString(1)); %></td>
	<td><%out.println(i3.getString(2)); %></td>
	
<%
	
}
}catch(Exception e){
	out.println(e);
}
%>

</table>



</body>
</html>