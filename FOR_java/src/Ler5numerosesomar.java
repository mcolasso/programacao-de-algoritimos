import java.util.Scanner;

public class Ler5numerosesomar {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int soma = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Digite um número: ");
            int numero = scanner.nextInt();
            soma += numero;
        }

        System.out.println("A soma dos números é: " + soma);
        scanner.close();

    }
}
