package services;

import java.util.ArrayList;
import java.util.List;
import model.Usuario;

public class UsuarioService {
  private Integer userIdCounter = 0;
  private List<Usuario> usuarios = new ArrayList<>();

  public Usuario criarUsuarios(String nome, String email) {
    Usuario usuarioCriado = new Usuario(getNewUserId(), nome, email);
    
    for (Usuario usuario : usuarios) {
      if (usuario.getEmail().equals(usuarioCriado.getEmail())) {
        throw new RuntimeException("Email já existe");
      }
    }

    usuarios.add(usuarioCriado);
    return usuarioCriado;
  }

  public List<Usuario> listarUsuarios() {
    return usuarios;
  }

  public Integer getNewUserId() {
    userIdCounter += 1;
    return userIdCounter;
  }
}
