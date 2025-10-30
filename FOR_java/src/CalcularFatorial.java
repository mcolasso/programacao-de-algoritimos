import java.util.Scanner;

public class CalcularFatorial {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite um número para calcular o fatorial: ");
        int numeros = scanner.nextInt();

        int fatorial = 1; 

        for (int i = numeros; i >= 1; i--) {
            fatorial = fatorial * i;
        }

        System.out.println("O fatorial de " + numeros + " é: " + fatorial);
        scanner.close();

    }
}
