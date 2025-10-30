import java.util.Scanner;

public class menu3opcoes {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("****PROGRAMA DE HORTIFRUIT****");

        System.out.print("Escolha uma das opções abaixo (1, 2 ou 3): ");
        int opcoes = scanner.nextInt();

        switch (opcoes) {
            case 1:
                System.out.println("Você escolheu a maçã! ");
                System.out.println("Obrigado! <3");
                break;
            case 2:
                System.out.println("Você escolheu a banana! ");
                System.out.println("Obrigado! <3");
                break;
            case 3:
                System.out.println("Você escolheu a melancia! ");
                System.out.println("Obrigado! <3");
                break;
            default:
                System.out.println("Opção inválida! Fruta não disponível em nosso catálogo. :( " );
                break;
        }

        scanner.close();

    }
}
