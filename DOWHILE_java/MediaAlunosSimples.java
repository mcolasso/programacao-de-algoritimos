import java.util.Scanner;

public class MediaAlunosSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome, resposta;

        do {
            System.out.print("Digite o nome do aluno: ");
            nome = scanner.nextLine();

            System.out.print("Digite a primeira nota: ");
            double nota1 = scanner.nextDouble();

            System.out.print("Digite a segunda nota: ");
            double nota2 = scanner.nextDouble();

            scanner.nextLine(); 

            double media = (nota1 + nota2) / 2;

            System.out.println("Média de " + nome + ": " + media);

            System.out.print("Quer continuar? (s/n): ");
            resposta = scanner.nextLine();

        } while (resposta.equalsIgnoreCase("s"));

        scanner.close();
    }
}
