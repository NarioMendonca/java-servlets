<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Simulação de Financiamento</title>
</head>
<body>

<h2>Simulação de Financiamento</h2>

<form action="simulation" method="post">

    Valor do veículo:
    <input type="number" step="0.01"
           name="valorVeiculo" required>
    <br><br>

    Entrada:
    <input type="number" step="0.01"
           name="entrada" required>
    <br><br>

    Taxa de juros mensal (%):
    <input type="number" step="0.01"
           name="juros" required>
    <br><br>

    Prazo (meses):
    <input type="number"
           name="prazo" required>
    <br><br>

    <input type="submit" value="Simular">

</form>

</body>
</html>