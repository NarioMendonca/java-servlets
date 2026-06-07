public class Ex08 {
  public static void main(String[] args) {
    Retangulo retangulo = new Retangulo(20.0, 10.0);
    System.out.println("Area: " + retangulo.calcularArea());
    System.out.println("Perimetro: " + retangulo.calcularPerimetro());
  }
}

class Retangulo {
  private Double altura;
  private Double largura;

  public Retangulo(Double altura, Double largura) {
    setAltura(altura);
    setLargura(largura);
  }

  public Double getAltura() {
    return altura;
  }

  public Double getLargura() {
    return largura;
  }

  private void setAltura(Double altura) {
    if (altura < 0) {
      throw new RuntimeException("Altura inválida");
    }
    this.altura = altura;
  }

  private void setLargura(Double largura) {
    if (largura < 0) {
      throw new RuntimeException("largura inválida");
    }
    this.largura = largura;
  }

  public Double calcularArea() {
    return getAltura() * getLargura();
  }

  public Double calcularPerimetro() {
    return getAltura() * 2 + getLargura() * 2;
  }
}
