/*
    32.	Receba um número inteiro. Calcule e mostre o seu fatorial.
*/
import javax.swing.JOptionPane;
public class Lt01_ex32 {
    public static void main(String args[]){
        int fat, ctd;
        fat = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        for(ctd=fat-1;ctd>0;ctd--){
            fat = fat * ctd;
            }
        JOptionPane.showMessageDialog(null, "O fatorial do número digitado é: " +fat);
    }
}
