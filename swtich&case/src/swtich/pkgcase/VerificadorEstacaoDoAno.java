package swtich.pkgcase;

import java.util.Scanner;

public class VerificadorEstacaoDoAno {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("**** PROGRAMA VERIFICADOR DE MÊS ****");

        System.out.println("Digite o número do mês (1 a 12):");
        int mes = scanner.nextInt();

        switch (mes) {
            case 12:
            case 1:
            case 2:
                System.out.println("Estação: Verão");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Estação: Outono");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Estação: Inverno");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Estação: Primavera");
                break;
            default:
                System.out.println("Mês inválido!");
                break;
        }

        scanner.close();
    }
}
