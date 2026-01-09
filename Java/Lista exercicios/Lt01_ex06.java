/*
    Trocar valores
 */
import javax.swing.JOptionPane;
public class Lt01_ex06 {
    public static void main (String args[]){
        int a, b, temp;
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor A: "));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor B: "));
        temp = a;
        a = b;
        b = temp;
        JOptionPane.showMessageDialog(null, "O valor 'A' é: "+a);
        JOptionPane.showMessageDialog(null, "O valor 'B' é: "+b);
    }
}