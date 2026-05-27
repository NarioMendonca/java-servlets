<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Login</title>
</head>
<body>

<h2>Tela de Login</h2>

<%
    String erro = (String) request.getAttribute("erro");

    if (erro != null) {
%>
        <p style="color:red;"><%= erro %></p>
<%
    }
%>

<form action="login" method="post">
    Usuário:
    <input type="text" name="usuario" required>
    <br><br>

    Senha:
    <input type="password" name="senha" required>
    <br><br>

    <input type="submit" value="Entrar">
</form>

</body>
</html>