<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Bem-vindo</title>
</head>
<body>

<%
    String nome = (String) request.getAttribute("usuario");
%>

<h2>Login realizado com sucessooooo!</h2>

<p>Bem-vindo, <b><%= nome %></b>!!</p>

</body>
</html>