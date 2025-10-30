package swtich.pkgcase;

import java.util.Scanner;

public class calculadora {

    public static void main(String[] args) {
      
        // Entrada do Scanner 
        Scanner scanner = new Scanner(System.in);
        System.out.println("***** PROGRAMA DE CALCULADORA SIMPLES *****");


        System.out.println("Digite o primeiro número:");
        int a = scanner.nextInt();
        
        
        System.out.println("Digite o segundo número:");
        int b = scanner.nextInt();

        scanner.nextLine();  // Limpa o buffer do Enter deixado pelo nextInt()

        System.out.println("Digite a operação desejada:");
        String operacao = scanner.nextLine();

        int resultado = 0;

        switch (operacao) {
            case "+":
                resultado = a + b;
                break;
            
            case "-":
                resultado = a - b;
                break;

            case "*": 
                resultado = a * b;
                break;

            case "/":
                if (b != 0) {
                    resultado = a / b;
                } else {
                    System.out.println("Operação inválida");
                }
                break;

            default:
                System.out.println("Operação inválida");
                break;
        }

        System.out.println("O resultado eh " + resultado);
        
        scanner.close();
    }
}
