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
<H1>selected students</H1>
<%

try{
	new Connection().establishConnection();
ResultSet rs=new selected_list().getlist();

%><table><%
%>
<tr>
<th>SERIAL NO</th>
<th>NAME</th>
<th>BOARD</th>
<th>TOTALMARKS</th>
<th>CGPA</th>
<th>PERCENTAGE</th>
<th>SCHOOL</th>
<th>DEPARTMENT_choice</th>
<th>ALLOTED_DEPARTMENT</th>
<th>
</tr>


<%
int j=1001;

while(rs.next()){
	

	%>
	<tr> <td><%out.println(j++);%></td>
	<td><%out.println(rs.getString(1)); %></td>
	<td><%out.println(rs.getString(2)); %></td>
	<td><%out.println(rs.getString(3)); %></td>
	<td><%out.println(rs.getString(4)); %></td>
	<td><%out.println(rs.getString(5)); %></td>
	<td><%out.println(rs.getString(6)); %></td>
	<td><%out.println(rs.getString(7)); %></td>
	<td><%out.println(rs.getString(8)); %></td>
	</tr>
<%
	
}
}catch(Exception e){
	e.printStackTrace();
}

%></table>

</body></html>