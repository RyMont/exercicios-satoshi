/*
    22.	Receba 2 valores inteiros e diferentes. Mostre seus valores em ordem crescente.
*/
import javax.swing.JOptionPane;
public class ex22 {
    static int v1, v2;
    public static void main(String args[]){
        RecebeValores();
        OrdenaValores();
    }
    
    static void RecebeValores(){
        v1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));
        v2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor: "));
        }
    
    static void OrdenaValores(){
        if (v1<v2){
            JOptionPane.showMessageDialog(null, "O primeiro valor em ordem crescente é: " +v1);
            JOptionPane.showMessageDialog(null, "O segundo valor em ordem crescente é: " +v2);
            }
        else{
            JOptionPane.showMessageDialog(null, "O primeiro valor em ordem crescente é: " +v2);
            JOptionPane.showMessageDialog(null, "O segundo valor em ordem crescente é: " +v1);
            }
        }
            
}
