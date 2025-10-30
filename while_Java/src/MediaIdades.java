import javax.swing.JOptionPane;

public class MediaIdades {
    public static void main(String[] args) {

        int idade = 0;         
        int soma = 0;           
        int contador = 0;  

        while (idade != -1) {
            String entrada = JOptionPane.showInputDialog("Digite a idade (-1 para sair):");
            idade = Integer.parseInt(entrada);

            if (idade >= 0) {  
                soma += idade;
                contador++;
            }
        }

        if (contador > 0) {
            double media = (double) soma / contador;
            JOptionPane.showMessageDialog(null, "A média das idades digitadas é: " + media);
        } else {
            JOptionPane.showMessageDialog(null, "Nenhuma idade válida foi digitada.");
        }
    }
}
