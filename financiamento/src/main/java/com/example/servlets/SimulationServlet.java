package com.example.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/simulation")
public class SimulationServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        double valorVeiculo = Double.parseDouble(req.getParameter("valorVeiculo"));
        double entrada = Double.parseDouble(req.getParameter("entrada"));
        double juros = Double.parseDouble(req.getParameter("juros"));
        int prazo = Integer.parseInt(req.getParameter("prazo"));

        double valorFinanciado = valorVeiculo - entrada;
        double taxa = juros / 100;

        double parcela = valorFinanciado * (taxa * Math.pow(1 + taxa, prazo)) / (Math.pow(1 + taxa, prazo) - 1);

        double totalPago = parcela * prazo;
        double totalJuros = totalPago - valorFinanciado;

        req.setAttribute("valorFinanciado", valorFinanciado);
        req.setAttribute("parcela", parcela);
        req.setAttribute("totalPago", totalPago);
        req.setAttribute("totalJuros", totalJuros);

        req.getRequestDispatcher("/results.jsp").forward(req, resp);
    }
}