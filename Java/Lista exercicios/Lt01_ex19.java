/*
    19.	Receba 2 valores reais. Calcule e mostre o maior deles.
*/
import javax.swing.JOptionPane;
public class Lt01_ex19 {
    public static void main(String args[]){
        Double n1, n2;
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número: "));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número: "));
        if (n1>n2){
            JOptionPane.showMessageDialog(null, "O maior número digitado foi: " +n1);
        }
        else{
            JOptionPane.showMessageDialog(null, "O maior número digitado foi: " +n2);
        }
    }
}
