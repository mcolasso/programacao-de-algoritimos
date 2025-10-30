import java.util.Scanner;

public class JogoAdivinhacaoSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroSecreto = 42;
        int palpite;

        System.out.println("Tente adivinhar o número secreto entre 1 e 100!");

        do {
            System.out.print("Digite seu palpite: ");
            palpite = scanner.nextInt();

            if (palpite < numeroSecreto) {
                System.out.println("Tente um número maior!");
            } else if (palpite > numeroSecreto) {
                System.out.println("Tente um número menor!");
            } else {
                System.out.println("Parabéns! Você acertou!");
            }

        } while (palpite != numeroSecreto);

        scanner.close();
    }
}
