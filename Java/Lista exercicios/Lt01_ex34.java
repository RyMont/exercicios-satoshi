/*
    34.	Receba um número. Calcule e mostre os resultados da tabuada desse número.
*/
import javax.swing.JOptionPane;
public class Lt01_ex34 {
    public static void main(String args[]){
    int num, ctd;
    num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
    for(ctd=1;ctd<=10;ctd++){
        JOptionPane.showMessageDialog(null,+num+" x "+ctd+" = "+num*ctd);
        }
    }
}
