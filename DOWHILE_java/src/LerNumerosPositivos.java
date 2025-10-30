import java.util.Scanner;

public class LerNumerosPositivos {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero;
        int contador = 0;

        do {
            System.out.println("Digite um número negativo para sair: ");
            numero = scanner.nextInt();

            if (numero >= 0) {
                contador++;
            }

        } while (numero >= 0);

        System.out.println("Quantidade de números positivos digitados: " + contador);

        scanner.close();
    }
}
