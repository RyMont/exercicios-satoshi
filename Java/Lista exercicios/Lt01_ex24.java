/*
    24.	Receba um valor inteiro. Verifique e mostre se é divisível por 2 e 3.
*/
import javax.swing.JOptionPane;
public class Lt01_ex24 {
    public static void main(String args[]){
    int num;
    num = Integer.parseInt(JOptionPane.showInputDialog("Digite o número: "));
    if (num%2==0 && num%3==0){
        JOptionPane.showMessageDialog(null, "O número digitado é divisível por 2 e 3.");
        }
    else{
        JOptionPane.showMessageDialog(null, "O número digitado não é divisível por 2 e 3.");
        }
    }
}
