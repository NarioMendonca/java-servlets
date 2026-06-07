package exerciciosjava.src;

import java.util.Scanner;

// verificação de maioridade
public class Ex01 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite sua idade: ");
    Integer age = scanner.nextInt();
    if (age >= 18) {
      System.out.println("Maior de idade, liberado!");
    } else {
      System.out.println("Menor de idade, não permitido!");
    }
    scanner.close();
  }
}