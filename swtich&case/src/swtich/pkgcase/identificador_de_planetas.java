package swtich.pkgcase;

import java.util.Scanner;

public class identificador_de_planetas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um planeta: ");
        String planeta = scanner.nextLine().toLowerCase(); // Aceita maiúsculas e minúsculas

        switch (planeta) {
            case "terra":
                System.out.println("Rochoso");
                break;
            case "saturno":
                System.out.println("Gasoso");
                break;
            case "jupiter":
                System.out.println("Gasoso");
                break;
            default:
                System.out.println("Planeta fora da lista!");
                break;
        }

        scanner.close();
    }
}
