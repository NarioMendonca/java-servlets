<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ page import="java.text.NumberFormat" %>
<%@ page import="java.util.Locale" %>

<html>
<head>
    <title>Resultado da Simulação</title>
</head>
<body>

<%

    String valorFinanciado = String.format("%.2f", (double) request.getAttribute("valorFinanciado"));

    String parcela = String.format("%.2f", (double) request.getAttribute("parcela"));

    String totalPago = String.format("%.2f", (double) request.getAttribute("totalPago"));

    String totalJuros = String.format("%.2f", (double) request.getAttribute("totalJuros"));
%>

<h2>Resultado da Simulação</h2>

<p>
    Valor financiado: R$<b><%= valorFinanciado %></b>
</p>

<p>
    Valor da parcela: R$<b><%= parcela %></b>
</p>

<p>
    Total pago: R$<b><%= totalPago %></b>
</p>

<p>
    Total de juros: R$<b><%= totalJuros %></b>
</p>

<br>

<a href="simulation.jsp">
    Nova simulação
</a>

</body>
</html>