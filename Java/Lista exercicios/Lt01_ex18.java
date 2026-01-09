/*
    18.	Receba 2 valores inteiros. Calcule e mostre o resultado da diferença do maior pelo menos valor.
 */
import javax.swing.JOptionPane;
public class Lt01_ex18 {
    public static void main(String args[]){
        int diff, n1, n2;
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
        if (n1>n2){
            diff = n1-n2;
        }
        else{
            diff = n2-n1;
        }
        JOptionPane.showMessageDialog(null, "A diferença entre os números é: " +diff);
    }
}
