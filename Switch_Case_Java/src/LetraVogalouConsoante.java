import javax.swing.JOptionPane;

public class LetraVogalouConsoante {
    public static void main(String[] args) {

        String letra = JOptionPane.showInputDialog(null, "Digite alguma letra: ").toLowerCase(); // Ajuda o usuário a
                                                                                                 // digitar tantos
                                                                                                 // maíusculas quanto
                                                                                                 // mínusculas.

        switch (letra) {
            case "a":
                JOptionPane.showMessageDialog(null, "Você digitou: " + letra);
                JOptionPane.showMessageDialog(null, "É vogal! ");
                break;
            case "e":
                JOptionPane.showMessageDialog(null, "Você digitou: " + letra);
                JOptionPane.showMessageDialog(null, "É vogal! ");
                break;
            case "i":
                JOptionPane.showMessageDialog(null, "Você digitou: " + letra);
                JOptionPane.showMessageDialog(null, "É vogal! ");
                break;
            case "o":
                JOptionPane.showMessageDialog(null, "Você digitou: " + letra);
                JOptionPane.showMessageDialog(null, "É vogal! ");
                break;
            case "u":
                JOptionPane.showMessageDialog(null, "Você digitou: " + letra);
                JOptionPane.showMessageDialog(null, "É vogal! ");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Você digitou: " + letra);
                JOptionPane.showMessageDialog(null, "É consoante! ");
                break;
        }
    }
}
