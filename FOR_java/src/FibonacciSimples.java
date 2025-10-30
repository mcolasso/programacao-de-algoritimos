import java.util.Scanner;

public class FibonacciSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos termos da sequência de Fibonacci você quer? ");
        int termos = scanner.nextInt();

        long a = 0L;
        long b = 1L;

        for (int i = 1; i <= termos; i++) {
            System.out.println(a);
            long c = a + b;
            a = b;
            b = c;
        }

        scanner.close();
    }
}
