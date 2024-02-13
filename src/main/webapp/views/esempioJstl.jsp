<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.example.demo.Student"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
		String pippo = (String) request.getAttribute("miaVar");

		ArrayList<Student> tmp = (ArrayList<Student>) request.getAttribute("myListStudents");
		out.print(pippo);
	%>


	<table border="1px">

		<%
			for (int i = 0; i < tmp.size(); i++) {
				Student r = tmp.get(i);
		%>
		<tr>
			<td>
				<%
					out.print(r.getId());
				%>
			</td>
			<td><%=r.getName()%></td>
		</tr>

		<%
			}
		%>


	</table>
tabella 2

<table border="1px">
	<c:forEach var="r"  items="${myListStudents}"  >
	 		<tr>
				<td>${r.id}</td>
				<td>${r.name}</td>
			</tr>         
	</c:forEach>
</table>


</body>
</html>