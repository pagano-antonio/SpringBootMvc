<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% String tmp = (String)request.getAttribute("ParolaCercata");%>


-<%out.println(tmp);%>-
 <h2>Inserimento Persona</h2>
 
 
 
    <form action="${pageContext.request.contextPath}/PersonaCtr" method="post">
        <label for="nome">Nome:</label>
        <input type="text" id="nome" name="nome" required><br><br>
        
        <label for="cognome">Cognome:</label>
        <input type="text" id="cognome" name="cognome" required><br><br>
        
        <button type="submit">Salva Persona</button>
    </form>
</body>
</html>