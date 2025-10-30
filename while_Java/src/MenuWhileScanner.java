import java.util.Scanner;

public class MenuWhileScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = -1; 

        while (opcao != 0) {
            System.out.println("Menu de opções:");
            System.out.println("1 - Dizer Olá");
            System.out.println("2 - Mostrar data");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Olá!");
                    break;
                case 2:
                    System.out.println("Hoje é 20/06/2025");
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }

        scanner.close();
    }
}
