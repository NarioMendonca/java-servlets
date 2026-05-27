package com.example.servlets;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    String usuario = req.getParameter("usuario");
    String senha = req.getParameter("senha");

    if (usuario.equals("admin") && senha.equals("admin123")) {
      req.setAttribute("usuario", usuario);
      req.getRequestDispatcher("/welcome.jsp").forward(req, resp);
    } else {
      req.setAttribute("erro", "Usuário ou senha inválidos");

      req.getRequestDispatcher("/login.jsp").forward(req, resp);
    }
  }
}
