<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Spring Page Redirection</title>
</head>
<body>
	<h2>Spring Page Redirection</h2>
	<p>Click below button to redirect the result to new page</p>
	<div>
		<form:form method="GET" action="/spring/redirect">
			<table>
				<tr>
					<td><input type="submit" value="Redirect Page" /></td>
				</tr>
			</table>
		</form:form>
	</div>
	<div>
		<form:form method="GET" action="/spring/staticPage">
			<table>
				<tr>
					<td><input type="submit" value="Get HTML Page" /></td>
				</tr>
			</table>
		</form:form>
	</div>
</body>
</html>