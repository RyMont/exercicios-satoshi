/*
    Aplicação que rende 1.3% ao mês
 */
import javax.swing.JOptionPane;
public class Lt01_ex08 {
    public static void main (String args[]){
        double valorInicial, valorFinal;
        valorInicial = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do investimento: "));
        valorFinal = (valorInicial * 1013)/1000;
        JOptionPane.showMessageDialog(null, "O valor após 1 mes de aplicação é: "+valorFinal);
    }
}
