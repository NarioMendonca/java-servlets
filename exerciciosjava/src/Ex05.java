import java.util.Scanner;

public class Ex05 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Quantidade de números para inserir: ");
    Integer numbersCount = scanner.nextInt();
    Integer biggerNum = 0;
    Integer smallerNum = 0;
    Integer number;
    for (int i = 0; i < numbersCount; i++) {
      System.out.println("Digite o %dº número: ".formatted(i + 1));
      number = scanner.nextInt();
      if (i == 0) {
        biggerNum = number;
        smallerNum = number;
      }
      if (number > biggerNum) {
        biggerNum = number;
      }
      if (number < smallerNum) {
        smallerNum = number;
      }
    }
    scanner.close();
    System.out.println("O maior valor informado foi: %d e o menor valor informado foi %d".formatted(biggerNum, smallerNum));
  }
}

