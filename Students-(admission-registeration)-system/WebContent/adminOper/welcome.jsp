<%@ page  import="java.util.Iterator,com.Business.logic.application_list_logic,com.Business.logic.Store_data,com.DAO.Connection,java.util.ArrayList" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
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

<%

try{
new application_list_logic().get_application_list();
ArrayList<String> li=new Store_data().getlist();
Iterator i=li.iterator();
int k=0;
out.println("<table>");
%>
<tr>
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



while(i.hasNext()){
	
	
	if(k%8==0){
	%><tr>
	<%
		
	}
%>
<td>

<%
out.println(i.next());
k++;
%>
	</td>
<%	
	if(k%8==0){
%></tr>
<%
	}
	}
	
out.println("</table>");
}catch(Exception e){
	out.println(e);
}



%>
</body>
</html>