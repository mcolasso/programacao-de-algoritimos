import java.util.Scanner;

public class DiaDaSemana {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("**** PROGRAMA DE DIA DA SEMANA ****");

        System.out.print("Digite uma opção para selecionar o dia da semana (1, 2, 3, 4, 5, 6 ou 7): ");
        int opcoes = scanner.nextInt();

        switch (opcoes) {
            case 1:
                System.out.println("Você escolheu: Domingo! ");
                System.out.println("Você fez uma ótima escolha! <3");
                break;
            case 2:
                System.out.println("Você escolheu: Segunda-feira. ");
                System.out.println("Vamos começar a semana! <3");
                break;
            case 3:
                System.out.println("Você escolheu: Terça-feira. ");
                System.out.println("Quase lá! <3");
                break;
            case 4:
                System.out.println("Você escolheu: Quarta-feira. ");
                System.out.println("Metade da semana! <3");
                break;
            case 5:
                System.out.println("Você escolheu: Quinta-feira. ");
                System.out.println("Está quase no fim! <3");
                break;
            case 6:
                System.out.println("Você escolheu: Sexta-feira. ");
                System.out.println("Fim de semana chegando! <3");
                break;
            case 7:
                System.out.println("Você escolheu: Sábado. ");
                System.out.println("Aproveite o seu dia! <3");
                break;
            default:
                System.out.println("Opção inválida! :( ");
                break;
        }

        scanner.close();
    }
}
