<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html lang="pt-br">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Listagem de usuários</title>
</head>
<body>
  <c:choose>
    <c:when test="${empty usuarios}">
      <p>Nenhum usuário cadastrado.</p>
    </c:when>

    <c:otherwise>
      <p>Total de usuários cadastrados: ${usuarios_count}</p>
    </c:otherwise>
  </c:choose>
  <a href="index.html">Voltar para cadastro</a>
  <ul>
    <c:forEach var="usuario" items="${usuarios}">
      <li>
        <p>Nome: ${usuario.name}</p>
        <p>Email: ${usuario.email}</p>
      </li>
    </c:forEach>
  </ul>
</body>
</html>