<%@ page  import="com.DAO.Connection" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html> 
<html> 
    <head> 
        <title>Example of HTML Frames using row attribute</title> 
        
    </head> 
          
    <frameset rows = "20%,*"> 
        <frame name = "top" src = "header.html" /> 
        <frame name = "bottom" src = "frame.html" /> 
     </frameset> 
     <body>
    
<%new Connection().establishConnection(); %>
     <header>
     
     <h1>welcome to home page</h1>
     </header>
     
     
     
     
     </body>
 
</html>