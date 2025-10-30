import java.util.Scanner;

public class Tabuada_for {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numeros = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            int resultado = numeros * i;
            System.out.println(numeros + " x " + i + " = " + resultado);
        }

        scanner.close();
    }
}
