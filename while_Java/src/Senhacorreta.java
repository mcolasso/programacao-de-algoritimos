import javax.swing.JOptionPane;

public class Senhacorreta {
    public static void main(String[] args) {

        String senha = JOptionPane.showInputDialog("Digite sua senha:");
        String nome = "Matheus";

        while (!senha.equals("1234")) {
            JOptionPane.showMessageDialog(null, "Senha incorreta!");
            senha = JOptionPane.showInputDialog("Digite sua senha novamente:");
        }

        JOptionPane.showMessageDialog(null, "Olá, " + nome + "!");
    }
}
