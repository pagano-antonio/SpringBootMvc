<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="com.example.demo.Student"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

   <h2>Registration Form</h2>
    <form:form modelAttribute="studentForm"  method="POST" action="/ctrvalidation/inserimento">
        <p>
            <form:label path="name">Name:</form:label>
            <form:input path="name" />
            <form:errors path="name" cssClass="error" />
       </p>
        <p>
            <form:label path="age">age:</form:label>
            <form:input path="age" />
        </p>
        <input type="submit" value="Register" />
    </form:form>
</body>
</html>