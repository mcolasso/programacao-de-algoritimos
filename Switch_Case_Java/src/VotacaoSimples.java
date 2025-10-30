import java.util.Scanner;

public class VotacaoSimples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] votos = new int[3];
        int opcao;

        do {
            System.out.println("Vote no seu candidato:");
            System.out.println("1 - Candidato A");
            System.out.println("2 - Candidato B");
            System.out.println("3 - Candidato C");
            System.out.println("0 - Sair e mostrar resultados");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    votos[0]++;
                    break;
                case 2:
                    votos[1]++;
                    break;
                case 3:
                    votos[2]++;
                    break;
                case 0:
                    System.out.println("Fim da votação.");
                    break;
                default:
                    System.out.println("Opção inválida, tente de novo.");
            }
        } while (opcao != 0);

        System.out.println("Resultado da votação:");
        System.out.println("Candidato A: " + votos[0]);
        System.out.println("Candidato B: " + votos[1]);
        System.out.println("Candidato C: " + votos[2]);

        sc.close();
    }
}
