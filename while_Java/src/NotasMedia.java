import javax.swing.JOptionPane;

public class NotasMedia {
    public static void main(String[] args) {

        int nota = 0;     
        int soma = 0;
        int contador = 0;

        while (nota >= 0 && nota <= 10) {
            String entrada = JOptionPane.showInputDialog("Digite uma nota (0 a 10). Nota inválida para sair:");
            nota = Integer.parseInt(entrada);

            if (nota >= 0 && nota <= 10) {
                soma += nota;
                contador++;
            }
        }

        if (contador > 0) {
            double media = (double) soma / contador;
            JOptionPane.showMessageDialog(null, "A média das notas digitadas é: " + media);
        } else {
            JOptionPane.showMessageDialog(null, "Nenhuma nota válida foi digitada.");
        }
    }
}
