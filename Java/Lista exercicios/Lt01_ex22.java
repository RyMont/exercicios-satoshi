/*
    22.	Receba 2 valores inteiros e diferentes. Mostre seus valores em ordem crescente.
*/
import javax.swing.JOptionPane;
public class Lt01_ex22 {
    public static void main(String args[]){
        int n1, n2;
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor: "));
        if (n1>n2){
            JOptionPane.showMessageDialog(null, "O primeiro valor em ordem crescente é: " +n2);
            JOptionPane.showMessageDialog(null, "O segundo valor em ordem crescente é: " +n1);
            }
        else{
            JOptionPane.showMessageDialog(null, "O primeiro valor em ordem crescente é: " +n1);
            JOptionPane.showMessageDialog(null, "O segundo valor em ordem crescente é: " +n2);
        }
    }
}
