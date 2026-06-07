import java.util.Scanner;

public class Ex03 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite um número para calcular o fatorial: ");
    Integer number = scanner.nextInt();
    Integer total = 1;
    for (int i = 1; i <= number; i++) {
      total = total * i;
    }
    System.out.println("resultado do fatorial de %d: %d".formatted(number, total));
    scanner.close();
  }
}

