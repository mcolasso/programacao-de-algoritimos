import java.util.Scanner;

public class Cadastro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] clientes = new String[5]; 
        int quantidade = 0;

        int opcao; 

        do {
            // Exibe o menu
            System.out.println("\n--- Menu ---");
            System.out.println("1 - Adicionar cliente");
            System.out.println("2 - Listar clientes");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    if (quantidade < 5) { 
                        System.out.print("Digite o nome do cliente: ");
                        clientes[quantidade] = sc.nextLine();
                        quantidade++; // Aumenta o contador
                        System.out.println("Cliente adicionado!");
                    } else {
                        System.out.println("Limite de 5 clientes atingido.");
                    }
                    break;

                case 2:
                    System.out.println("Lista de clientes:");
                    for (int i = 0; i < quantidade; i++) {
                        System.out.println((i + 1) + " - " + clientes[i]);
                    }
                    break;

                case 0:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 0); 

        sc.close(); 
    }
}
