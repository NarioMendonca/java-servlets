public class Ex04 {
  public static void main(String[] args) {
    Aluno aluno = new Aluno("Rogerio", 6.0);

    System.out.println("Nome: " + aluno.getNome() + " Nota: " + aluno.getNota());
    System.out.println("Status: " + (aluno.estaAprovado() ? "Aprovado" : "Reprovado"));
    System.out.println("Classificação: " + aluno.avaliarDesempenho());
  }
}

class Aluno {
  private String nome;
  private Double nota;

  public Aluno(String nome, Double nota) {
    setNome(nome);
    setNota(nota);
  }

  public String getNome() {
    return nome;
  }

  public Double getNota() {
    return nota;
  }

  public void setNome(String nome) {
    if (nome == null || nome.isEmpty()) {
      throw new RuntimeException("Nome inválido");
    }
    this.nome = nome;
  }

  public void setNota(Double nota) {
    if (nota < 0 || nota > 10) {
      throw new RuntimeException("Nota inválida");
    }
    this.nota = nota;
  }

  public boolean estaAprovado() {
    if (nota >= 6) {
      return true;
    }
    return false;
  }

  public Character avaliarDesempenho() {
    if (nota < 7) {
      return 'C';
    } else if (nota < 9) {
      return 'B';
    } else {
      return 'A';
    }
  }
}
