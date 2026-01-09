/*
    19.	Receba 2 valores reais. Calcule e mostre o maior deles.
*/
import javax.swing.JOptionPane;
public class ex19 {
    static double maior;
    public static void main(String args[]){
        double n1, n2;
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: "));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor: "));
        DeterminaMaior(n1, n2);
        JOptionPane.showMessageDialog(null, "O maior número digitado foi: " +maior);
    }
    static void DeterminaMaior(double v1, double v2){
        if (v1>v2){
            maior = v1;
        }
        else{
            maior = v2;
        }
    }
}
