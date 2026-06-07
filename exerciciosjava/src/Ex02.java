package exerciciosjava.src;

//Classe produto
public class Ex02 {
  public static void main(String[] args) {
    // criando produto
    Produto produto = new Produto("Monitor", 520.95, 20);

    // exibindo dados
    System.out.println(produto.toString());

    // calculando total
    System.out.println(produto.calcularValorTotalEstoque());
  }
}

class Produto {
  String nome;
  Double preco;
  Integer quantidade;

  public Produto(String nome, Double preco, Integer quantidade) {
    this.nome = nome;
    this.preco = preco;
    this.quantidade = quantidade;
  }

  public Double calcularValorTotalEstoque() {
    return preco * quantidade;
  }

  @Override
  public String toString() {
    return "Nome: %s | Preço: %f | Quantidade: %d".formatted(nome, preco, quantidade);
  }
}
