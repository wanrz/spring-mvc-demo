<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hello World</title>
</head>
<body>
	<h2>${message}</h2>
	
	<h2>Submitted Student Information</h2>
   <table>
	    <tr>
	        <td>Name</td>
	        <td>${name}</td>
	    </tr>
	    <tr>
	        <td>Age</td>
	        <td>${age}</td>
	    </tr>
	    <tr>
	        <td>ID</td>
	        <td>${id}</td>
	    </tr>
	</table>
</body>
</html>