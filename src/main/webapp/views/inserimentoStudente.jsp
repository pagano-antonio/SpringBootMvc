<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="com.example.demo.Student"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

   <h2>Registration Form</h2>
    <f:form modelAttribute="studentForm"  method="POST" action="/inserimento">
        <p>
            <f:label path="name">Name:</f:label>
            <f:input path="name" />
            <!-- f:errors path="name" cssClass="error" /> -->
       </p>
        <p>
            <f:label path="age">age:</f:label>
            <f:input path="age" />
        </p>
        <input type="submit" value="Register" />
    </f:form>
</body>
</html>