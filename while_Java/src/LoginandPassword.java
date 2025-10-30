import javax.swing.JOptionPane;

public class LoginandPassword {
    public static void main(String[] args) {

        String nome = "Matheus";

        String login = JOptionPane.showInputDialog("Digite seu login:");
        String senha = JOptionPane.showInputDialog("Digite sua senha:");

        while (!senha.equals("2006") || !login.equals("matt")) {
            JOptionPane.showMessageDialog(null, "Login ou senha incorretos!");

            login = JOptionPane.showInputDialog("Digite seu login novamente:");
            senha = JOptionPane.showInputDialog("Digite sua senha novamente:");
        }

        JOptionPane.showMessageDialog(null, "Login e senha corretos! Bem-vindo! " + nome);
    }
}
