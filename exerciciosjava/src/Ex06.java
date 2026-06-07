public class Ex06 {
  public static void main(String[] args) {
    ContaBancaria contaBancaria = new ContaBancaria();
    System.out.println("Número da sua conta: " + contaBancaria.getNumeroConta());
    System.out.println(contaBancaria.consultarSaldo());
    try {
      contaBancaria.sacar(100.0);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    contaBancaria.depositar(1600.0);
    System.out.println(contaBancaria.consultarSaldo());
    contaBancaria.sacar(200.0);
    System.out.println(contaBancaria.consultarSaldo());
  }
}

class ContaBancaria {
  private String numeroConta;
  private static Integer numeroContasAtual = 1;
  private Double saldo;

  public ContaBancaria() {
    this.numeroConta = numeroContasAtual.toString();
    numeroContasAtual += 1;
    setSaldo(0.0);
  }
  
  public String getNumeroConta() {
    return numeroConta;
  }

  private Double getSaldo() {
    return saldo;
  }

  private void setSaldo(Double saldo) {
    this.saldo = saldo;
  }

  public void depositar(Double valor) {
    setSaldo(getSaldo() + valor);
  }

  public void sacar(Double valor) {
    if (valor > getSaldo()) {
      throw new RuntimeException("Saldo insuficiente para operação de saque no valor de R$%.2f".formatted(valor));
    }
    setSaldo(getSaldo() - valor);
  }

  public String consultarSaldo() {
    return "Seu saldo é de: R$%.2f".formatted(getSaldo());
  }
}
