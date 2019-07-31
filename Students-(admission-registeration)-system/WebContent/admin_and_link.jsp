<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.DAO.Connection"%>

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
	 background-color: #595959;
	

}
a{
color:white;}
#id2{

	width:200px;
	height:55px;
border: 2px solid white;
color:white;
background-color:grey;
}
body{
background-image:url("sim1.jpeg");
}

</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
try{
new Connection().establishConnection();
if(session.isNew()){
	
	session.setAttribute("name","true");
}
String q=(String)session.getAttribute("name");
if("wrong".equals(q)){
	out.println("<script type=\"text/javascript\">");  
	out.println("alert('wrong inputs');");  
	out.println("</script>");
}
}catch(Exception e){
	out.println(e);
}
	%>
<center><fieldset id="id1">
<center><fieldset id="id2"><h3>Welcome to admin login page</h3></fieldset></center>
<form action="parent-control" method="post"><br><br>
<input type="hidden" name="choice" value="login">
username <input type="text" name="username"><br><br>
password <input type="password" name="password"><br><br>
<input type="submit"><br><br><br>
<a href="newadmissionform.jsp">apply for new admission</a>
</fieldset></form>
</fieldset></center>

</body>
</html>