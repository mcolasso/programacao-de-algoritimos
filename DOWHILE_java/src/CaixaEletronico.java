import javax.swing.JOptionPane;

public class CaixaEletronico {
    public static void main(String[] args) {

        double saldo = 1585.00;
        String entrada;

        do {
            entrada = JOptionPane.showInputDialog(null,
                    "****PROGRAMA DE CAIXA ELETRÔNICO****\n" +
                            "Digite alguma opção: (Saque / Depósito / Saldo / Sair)")
                    .toLowerCase();

            switch (entrada) {
                case "saque":
                    if (saldo <= 0) {
                        JOptionPane.showMessageDialog(null, "Saldo insuficiente!");
                    } else {
                        JOptionPane.showMessageDialog(null,
                                "Quanto deseja sacar? Opções: 20, 50, 100 ou 200");

                        String saqueInput = JOptionPane.showInputDialog(null, "Digite o valor de saque: ");
                        int saque = Integer.parseInt(saqueInput);

                        if (saque == 20 || saque == 50 || saque == 100 || saque == 200) {
                            if (saldo >= saque) {
                                saldo -= saque;
                                JOptionPane.showMessageDialog(null,
                                        "Saque de R$ " + saque + " realizado com sucesso.");
                                JOptionPane.showMessageDialog(null,
                                        "Saldo atual: R$ " + saldo);
                            } else {
                                JOptionPane.showMessageDialog(null,
                                        "Saldo insuficiente para o saque.");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null,
                                    "Valor de saque inválido. Opções válidas: 20, 50, 100 ou 200.");
                        }
                    }
                    break;

                case "depósito":
                    JOptionPane.showMessageDialog(null, "Quanto deseja depositar?");
                    String depositoInput = JOptionPane.showInputDialog(null, "Digite o valor: ");
                    double deposito = Double.parseDouble(depositoInput);

                    saldo += deposito;
                    JOptionPane.showMessageDialog(null,
                            "Depósito de R$ " + deposito + " realizado com sucesso.");
                    JOptionPane.showMessageDialog(null,
                            "Novo saldo: R$ " + saldo);
                    break;

                case "saldo":
                    JOptionPane.showMessageDialog(null,
                            "Seu saldo atual é: R$ " + saldo);
                    break;

                case "sair":
                    JOptionPane.showMessageDialog(null,
                            "Obrigado por usar nosso sistema. Até mais!");
                    break;

                default:
                    JOptionPane.showMessageDialog(null,
                            "Opção inválida! :(");
                    break;
            }
        } while (!entrada.equals("sair"));

    }
}
