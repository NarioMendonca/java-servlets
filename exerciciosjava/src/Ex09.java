import java.util.Scanner;

public class Ex09 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Inicio do intervalo: ");
    Integer inicio = scanner.nextInt();
    System.out.println("Fim do intervalo: ");
    Integer fim = scanner.nextInt();

    Integer numeroAtual = inicio;
    Integer contagemImpares = 0;

    while (numeroAtual < fim) {
      if (numeroAtual % 2 == 1) {
        contagemImpares += 1;
      }
      numeroAtual += 1;
    }

    System.out.println("Quantidade de números impares no intervalo: " + contagemImpares);
    scanner.close();
  }
}

