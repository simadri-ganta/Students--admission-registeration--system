<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<style>
#id1{
	align:center;
	width:300px;
	height:450px;
	padding: 90px;
	 border: 1px solid black;
	 background-color:lightgrey;

}
#id2{
	width:200px;
	height:55px;
border: 2px solid white;
color:white;
background-color:grey;
}
body{
}
td{
padding:10px;
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
function ssc(){
	document.getElementById("id3").disabled=true;
}
function cbse(){
	document.getElementById("id3").disabled=false;
}


</script>
</head>
<body>

<center><fieldset id="id1">
<center><fieldset id="id2"><h3>Welcome admission page</h3></fieldset></center>
<form action="parent-control" method="post"><br><br>
<table>
<tr>
<td>name</td> <td><input type="text" name="name"><br><br>
</tr>
<tr>
<td>Board type:</td> <td>ssc<input onclick="ssc()" type="radio" name="board" value="ssc">
            cbse<input onclick="cbse()" type="radio" name="board" value="cbse"></td>
  </tr>          
  <tr>          
<td>total marks</td> <td><input type="text" name="marks"></td>
</tr>
<tr>
<td>gpa</td> <td><input id="id3" type="text" name="gpa"></td>
</tr>
<tr>
<td>percentage</td> <td><input onchange="id77()" type="text" name="percentage"></td>
</tr>
<tr>
<td>school</td> <td><input type="text" name="school"></td>
</tr>
<tr>
<td>department choice</td> <td><input type="text" name="department"></td>
</tr>
<tr><td></td>
<input type="hidden" name="choice" value="newapplication">
<td><input type="submit"></td>
</tr>
</table>
</form>
</fieldset></center>

</body>
</html>