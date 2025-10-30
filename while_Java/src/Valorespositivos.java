import javax.swing.JOptionPane;

public class Valorespositivos {
    public static void main(String[] args) {

        int numero = 1;
        int soma = 0;
        int contador = 0;

        while (numero >= 0) {
            String valorDigitado = JOptionPane.showInputDialog("Digite um número: ");
            numero = Integer.parseInt(valorDigitado);

            if (numero >= 0) {
                soma += numero;
                contador++;
            }
        }

        if (contador > 0) {
            double media = (double) soma / contador;
            JOptionPane.showMessageDialog(null, "A média dos números digitados é: " + media);
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum número positivo foi digitado.");
        }

        JOptionPane.showMessageDialog(null, "Número negativo digitado. Programa encerrado!");
    }
}
