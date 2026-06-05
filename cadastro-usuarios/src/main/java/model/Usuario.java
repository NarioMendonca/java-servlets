package model;

public class Usuario {
  private Integer id;
  private String email;
  private String name;

  public Usuario(Integer id, String name, String email) {
    setId(id);
    setName(name);
    setEmail(email);
  }

  public Integer getId() {
    return id;
  }

  public String getEmail() {
    return email;
  }

  public String getName() {
    return name;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public void setEmail(String email) {
    if (!email.contains("@")) {
      throw new RuntimeException("Email inválido");
    }
    this.email = email;
  }

  public void setName(String name) {
    if (name.length() < 3) {
      throw new RuntimeException("Nome deve ter mais de 3 caracteres");
    }
    this.name = name;
  }
}
