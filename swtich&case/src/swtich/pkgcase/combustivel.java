package swtich.pkgcase;

import java.util.Scanner;

public class combustivel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma letra (A/G/D/E): ");
        char letra = scanner.next().charAt(0);
        letra = Character.toUpperCase(letra); // O usuário pode digitar a, g, d, e, A, G, D ou E.


        switch (letra) {
            case 'A':
                System.out.println("Alcool");
                break;
            case 'G':
                System.out.println("Gasolina");
                break;
            case 'D':
                System.out.println("Diesel");
                break;
            case 'E':
                System.out.println("Eletrico");
                break;
            default:
                System.out.println("Combustível inválido!");
                break;
        }

        scanner.close();
    }
}
