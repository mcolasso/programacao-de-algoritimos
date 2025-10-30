import java.util.Scanner;

public class SistemaLoginSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String usuarioCorreto = "matt";
        String senhaCorreta = "2006";

        String usuarioDigitado, senhaDigitada;
        int tentativas = 0;

        do {
            System.out.print("Digite o usuário: ");
            usuarioDigitado = scanner.nextLine();

            System.out.print("Digite a senha: ");
            senhaDigitada = scanner.nextLine();

            tentativas++;

            if (usuarioDigitado.equals(usuarioCorreto) && senhaDigitada.equals(senhaCorreta)) {
                System.out.println("Login realizado com sucesso!");
                break;
            } else {
                System.out.println("Usuário ou senha incorretos. Tente novamente.");
            }
        } while (tentativas < 3);

        if (!usuarioDigitado.equals(usuarioCorreto) || !senhaDigitada.equals(senhaCorreta)) {
            System.out.println("Número máximo de tentativas excedido. Acesso bloqueado.");
        }

        scanner.close();
    }
}
