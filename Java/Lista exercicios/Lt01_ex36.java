/*
    36.	Receba um número N. Calcule e mostre a série 1 + 1/1! + 1/2! + ... + 1/N!
*/
import javax.swing.JOptionPane;
public class Lt01_ex36 {
    public static void main(String args[]){
        int n, fat, ctd, ctd2;
        double serie;
        serie = 1;
        fat = 1;
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        for(ctd=n; ctd>0; ctd--){
            for(ctd2=ctd; ctd2>0; ctd2--){
                fat = fat * ctd2;
            }
            serie+=Math.pow(fat, -1);
        }
        JOptionPane.showMessageDialog(null, "O resultado da série é: "+serie);
    }
}
