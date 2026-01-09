/*
    29.	Receba o tipo de investimento (1 = poupança e 2 = renda fixa) e o valor do investimento. Calcule e mostre o valor corrigido em 30 dias sabendo que a poupança = 3% e a renda fixa = 5%. Demais tipos não serão considerados.
*/
import javax.swing.JOptionPane;
public class Lt01_ex29 {
    public static void main(String args[]){
        int tipoInvestimento;
        double valorInvestimento, valorCorrigido;
        tipoInvestimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o tipo de investimento, 1 para poupança, 2 para renda fixa: "));
        valorInvestimento = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do investimento: "));
        if (tipoInvestimento!=1 && tipoInvestimento!=2){
            JOptionPane.showMessageDialog(null, "Tipo de investimento inválido.");
        }
        else{
            if (tipoInvestimento == 1){
                valorCorrigido = valorInvestimento * 1.03;
                }
            else{
               valorCorrigido = valorInvestimento * 1.05;
                }
            JOptionPane.showMessageDialog(null, "O valor após 1 mes investido será: " +valorCorrigido);
        }
    }
}
