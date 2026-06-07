import java.util.Scanner;

public class Ex10 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Integer opcao = 0;
    System.out.println("""
      1 - Somar
      2 - Subtrair
      3 - Multiplicar
      4 - Dividir
      5 - Sair
    """);

    Double a;
    Double b;

    do {
      System.out.print("Sua opção: ");
      opcao = scanner.nextInt();
      if (opcao == 5) {
        break;
      }

      System.out.print("Primeiro valor: ");
      a = scanner.nextDouble();
      System.out.print("Segundo valor: ");
      b = scanner.nextDouble();

      switch (opcao) {
        case 1:
          System.out.println(Calculadora.somar(a, b));
          break;
        case 2:
          System.out.println(Calculadora.subtrair(a, b));
          break;
        case 3:
          System.out.println(Calculadora.multiplicar(a, b));
          break;
        case 4:
          System.out.println(Calculadora.dividir(a, b));
          break;
        default:
          System.out.println("Opção inválida!");
          break;
      }
    } while (opcao != 5);
    scanner.close();
  }
}

class Calculadora {
  public static Double somar(Double a, Double b) {
    return a + b;
  }

  public static Double subtrair(Double a, Double b) {
    return a - b;
  }

  public static Double multiplicar(Double a, Double b) {
    return a * b;
  }

  public static Double dividir(Double a, Double b) {
    if (b == 0) {
      throw new RuntimeException("Divisor inválido");
    }
    return a / b;
  }
  
}
