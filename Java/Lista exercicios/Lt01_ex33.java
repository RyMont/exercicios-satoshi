/*
    33.	Receba um número. Calcule e mostre a série 1 + 1/2 + 1/3 + ... + 1/N.
*/
import javax.swing.JOptionPane;
public class Lt01_ex33 {
    public static void main(String args[]){
        int n, den;
        double serie;
        serie = 0;
        n = Integer.parseInt(JOptionPane.showInputDialog("Digita um número aí: "));
        for(den=1; den<=n; den++){
            serie += Math.pow(den, -1);
        }
        JOptionPane.showMessageDialog(null, "O resultado da série é: "+serie);
    }
}
