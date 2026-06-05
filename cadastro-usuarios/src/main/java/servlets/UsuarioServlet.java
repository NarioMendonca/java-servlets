package servlets;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Usuario;
import services.UsuarioService;

@WebServlet("/usuarios")
public class UsuarioServlet extends HttpServlet {
  private UsuarioService usuarioService = new UsuarioService();

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    List<Usuario> usuarios = usuarioService.listarUsuarios();
    req.setAttribute("usuarios", usuarios); 
    req.setAttribute("usuarios_count", usuarios.size());
    req.getRequestDispatcher("/listar.jsp").forward(req, resp);
  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    String username = req.getParameter("username");
    String email = req.getParameter("email");

    try {
      if (username == null || username.isEmpty()) {
        throw new RuntimeException("O campo de nome de usuário está vazio");
      }
      if (email == null || email.isEmpty()) {
        throw new RuntimeException("O campo de email está vazio");
      }

      usuarioService.criarUsuarios(username, email);
    } catch (Exception error) {
      req.setAttribute("errMessage", error.getMessage());
      req.getRequestDispatcher("erro.jsp").forward(req, resp);
    }


    resp.sendRedirect(req.getContextPath() + "/usuarios");
  }
}
