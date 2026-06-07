import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex07 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Integer opcao = 0;
    System.out.println("""
      1 - Cadastrar
      2 - Consultar
      3 - Atualizar
      4 - Excluir
      5 - Sair
    """);

    do {
      opcao = scanner.nextInt();
      switch (opcao) {
        case 1:
          System.out.println("Cadastrando...");
          break;
        case 2:
          System.out.println("Consultando...");
          break;
        case 3:
          System.out.println("Atualizando...");
          break;
        case 4:
          System.out.println("Excluindo...");
          break;
        case 5: break;
        default:
          System.out.println("Opção inválida!");
          break;
      }
    } while (opcao != 5);
    scanner.close();
  }
}


