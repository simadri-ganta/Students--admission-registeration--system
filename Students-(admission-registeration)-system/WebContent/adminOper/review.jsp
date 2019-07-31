<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.sql.*,com.DAO.Application_count,com.DAO.Depart_count"%>
<!DOCTYPE html>
<html>
<head>
<style>
#id1{
	align:center;
	width:300px;
	height:300px;
	padding: 90px;
	 border: 1px solid black;
	 background-color:lightgrey;

}
#id2{
border: 2px solid white;
color:white;
background-color:grey;
}
table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 100%;
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
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<fieldset id="id1">
<center><fieldset id="id2"><h2>current status</h2></fieldset></center>
<table>
<tr>
<td>Applcations received</td><td><%
int i=new Application_count().getcount();
out.println(i);
%></td>
</tr>

<tr>
<td>last Date for the applications review</td><td>06/12/2010</td>
</tr>

<tr>
<td>Board of undertaking</td><td>SSC,CBSE</td>
</tr>

<tr>
<td>Admissions Status</td><td>undergoing</td>
</tr>

<tr>
<td>Total no of seats</td><td>25</td>
</tr>

<tr>
<td>available seats</td><td><%


ResultSet rs=new Depart_count().count_cse();
ResultSet rs1=new Depart_count().count_ece();
		ResultSet rs2=new Depart_count().count_It();
		ResultSet rs3=new Depart_count().count_mechanical();
		rs.next();
		rs1.next();
		rs2.next();
		rs3.next();
		int a1=Integer.parseInt(rs.getString(1));
		int a2=Integer.parseInt(rs1.getString(1));
		int a3=Integer.parseInt(rs2.getString(1));
		int a4=Integer.parseInt(rs3.getString(1));
		int n=a1+a2+a3+a4;
		out.println(25-n);
		%></td>
</tr>

<tr>
<td>academics staring date</td><td>08/1/2021</td>
</tr>

</table>




</fieldset></fieldset>
</body>
</html>