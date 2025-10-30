import java.util.Scanner;

public class Produto_categoria {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(
                "Produtos disponíveis: Banana, Maçã, Chocolate, Bala, Oléo Capilar, Shampoo, Arroz, Feijão, Sabão em pó, Amaciante");
        System.out.print("Digite um produto disponível no catálogo: ");
        String produto = sc.nextLine();

        switch (produto.toLowerCase()) {
            // Frutas
            case "banana":
            case "maçã":
                System.out.println("Você digitou: " + produto);
                System.out.println("A categoria é Frutas!");
                break;

            // Doces
            case "chocolate":
            case "bala":
                System.out.println("Você digitou: " + produto);
                System.out.println("A categoria é Doces!");
                break;

            // Cosméticos
            case "óleo capilar":
            case "shampoo":
                System.out.println("Você digitou: " + produto);
                System.out.println("A categoria é Cosméticos!");
                break;

            // Alimentos
            case "arroz":
            case "feijão":
                System.out.println("Você digitou: " + produto);
                System.out.println("A categoria é Alimentos!");
                break;

            // Produtos de limpeza
            case "sabão em pó":
            case "amaciante":
                System.out.println("Você digitou: " + produto);
                System.out.println("A categoria é Limpeza!");
                break;

            default:
                System.out.println("Produto inválido! Por favor, digite outro disponível :/");
                break;
        }

        sc.close();
    }
}
