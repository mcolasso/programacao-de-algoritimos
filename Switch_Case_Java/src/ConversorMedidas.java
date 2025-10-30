import java.util.Scanner;

public class ConversorMedidas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Conversor de Medidas:");
        System.out.println("1 - Km para metros");
        System.out.println("2 - Metros para centímetros");
        System.out.println("3 - Metros para milímetros");
        System.out.println("4 - Cm para metros");

        System.out.print("Escolha uma opção (1 a 4): ");
        int opcao = sc.nextInt();

        System.out.print("Digite o valor a ser convertido: ");
        double valor = sc.nextDouble();

        switch (opcao) {
            case 1:
                System.out.println(valor + " km = " + (valor * 1000) + " metros");
                break;
            case 2:
                System.out.println(valor + " metros = " + (valor * 100) + " centímetros");
                break;
            case 3:
                System.out.println(valor + " metros = " + (valor * 1000) + " milímetros");
                break;
            case 4:
                System.out.println(valor + " centímetros = " + (valor / 100) + " metros");
                break;
            default:
                System.out.println("Opção inválida!");
        }

        sc.close();
    }
}
