/*
    Soma dos quadrados dos números
 */
import javax.swing.JOptionPane;
public class Lt01_ex09 {
    public static void main (String args[]){
        int n1, n2, soma;
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));
        soma = (n1*n1)+(n2*n2);
        JOptionPane.showMessageDialog(null, "O valor da soma dos quadrados dos números digitados é: "+soma);
    }
}
