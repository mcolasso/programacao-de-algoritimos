import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número 1: ");
        int maior = scanner.nextInt();  

        for (int i = 2; i <= 10; i++) {
            System.out.print("Digite o número " + i + ": ");
            int numero = scanner.nextInt();

            if (numero > maior) {
                maior = numero;
            }
        }

        System.out.println("O maior número digitado é: " + maior);

        scanner.close();
    }
}
