import java.util.Scanner;

public class ValidarSenhaSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String senhaCorreta = "1234";
        String senhaDigitada;
        int tentativas = 0;

        do {
            System.out.print("Digite a senha: ");
            senhaDigitada = scanner.nextLine();
            tentativas++;

            if (senhaDigitada.equals(senhaCorreta)) {
                System.out.println("Senha correta! Acesso liberado.");
                break;
            } else {
                System.out.println("Senha incorreta. Tente novamente.");
            }

        } while (tentativas < 3);

        if (!senhaDigitada.equals(senhaCorreta)) {
            System.out.println("Número máximo de tentativas excedido. Acesso negado.");
        }

        scanner.close();
    }
}
