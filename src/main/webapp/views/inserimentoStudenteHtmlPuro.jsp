<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <form id="studentForm" action="/inserimento" method="POST">
        <p>
            <label for="name">Name:</label>
            <input id="name" name="name" type="text" value=""/>

        </p>
        <p>
            <label for="age">age:</label>
            <input id="age" name="age" type="text" value=""/>

        </p>
        <input type="submit" value="Register" />
    </form>
</body>
</html>