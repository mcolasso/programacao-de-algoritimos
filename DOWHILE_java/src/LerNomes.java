import java.util.Scanner;

public class LerNomes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nome;
        int contador = 0;

        do {
            System.out.println("Digite um nome (ou 'fim' para encerrar): ");
            nome = scanner.nextLine();

            if (!nome.equalsIgnoreCase("fim")) {
                contador++;
            }

        } while (!nome.equalsIgnoreCase("fim"));

        System.out.println("Quantidade de nomes digitados: " + contador);

        scanner.close();
    }
}
