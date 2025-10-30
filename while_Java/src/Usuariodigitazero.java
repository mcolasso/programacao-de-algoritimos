import java.util.Scanner;

public class Usuariodigitazero {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numero = 1;

        while (numero != 0) {
            System.out.print("Digite um número (zero para sair): ");
            numero = scanner.nextInt();
        }

        System.out.println("Você saiu do programa!");
        scanner.close();
    }
}
