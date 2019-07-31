<%@ page  import="com.DAO.*,java.sql.*,java.util.Iterator,com.Business.logic.application_list_logic,com.Business.logic.Store_data,com.DAO.Connection,java.util.ArrayList" language="java" contentType="text/html; charset=ISO-8859-1"
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
<H1>top 10% of applicants who are still in pending</H1>
<%

try{

ResultSet i=new Top().getlist();
int k=0;
%><table><%
%>
<tr>
<th>SERIAL NO</th>
<th>application id</th>
<th>NAME</th>
<th>BOARD</th>
<th>TOTALMARKS</th>
<th>CGPA</th>
<th>PERCENTAGE</th>
<th>SCHOOL</th>
<th>DEPARTMENT</th>
</tr>


<%
int j=1001;
int l=0,l1=0;
while(i.next()){
	l++;
}
int n=l/10;
while(i.next()){
	l1++;
	if(l1==n)
		break;
	%>
	<tr> <td><%out.println(j++);%></td>
	<td><%out.println(i.getString(1)); %></td>
	<td><%out.println(i.getString(2)); %></td>
	<td><%out.println(i.getString(3)); %></td>
	<td><%out.println(i.getString(4)); %></td>
	<td><%out.println(i.getString(5)); %></td>
	<td><%out.println(i.getString(6)); %></td>
	<td><%out.println(i.getString(7)); %></td>
	<td><%out.println(i.getString(8)); %></td>
	</tr>
<%
	
}
}catch(Exception e){
	out.println(e);
}

%></table>

</body></html>