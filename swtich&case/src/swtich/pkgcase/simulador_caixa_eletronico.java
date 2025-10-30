package swtich.pkgcase;

import java.util.Scanner;

public class simulador_caixa_eletronico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a opção de saque: (R$10, R$20, R$50, R$100)");
        String saque = scanner.nextLine().toLowerCase().replace("r$", "").trim(); 

        switch (saque) {
            case "10":
                System.out.println("Saque concluído, obrigado!");
                break;
            case "20":
                System.out.println("Saque concluído, obrigado!");
                break;
            case "50":
                System.out.println("Saque concluído, obrigado!");
                break;
            case "100":
                System.out.println("Saque concluído, obrigado!");
                break;
            default:
                System.out.println("Saque inválido, tente digitar novamente.");
                break;
        }

        scanner.close();
    }
}
