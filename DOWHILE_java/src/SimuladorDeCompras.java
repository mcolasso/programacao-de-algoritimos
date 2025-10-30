import java.util.Scanner;

public class SimuladorDeCompras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double valor;
        double total = 0;

        do {
            System.out.print("Digite o valor da compra (ou 0 para encerrar): R$ ");
            valor = scanner.nextDouble();

            total += valor;

        } while (valor != 0);

        System.out.println("O total das compras foi: R$ " + total);

        scanner.close();
    }
}
