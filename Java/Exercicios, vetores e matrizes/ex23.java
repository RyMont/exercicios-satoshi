/*
    23.	Receba 3 valores obrigatoriamente em ordem crescente e um 4º valor não necessariamente em ordem. Mostre os 4 números em ordem crescente.
*/
import javax.swing.JOptionPane;
public class ex23 {
    static double n1, n2, n3, n4;
    public static void main(String args[]){
        ReceberValores();
        }
    
    static void ReceberValores(){
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: "));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor: "));
        if (n2<n1){
            JOptionPane.showMessageDialog(null, "O número digitado não pode ser menor que o anterior.");
            }
        else{
            n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro valor: "));
            if (n3<n2){
                JOptionPane.showMessageDialog(null, "O número digitado não pode ser menor que o anterior.");
                }
            n4 = Double.parseDouble(JOptionPane.showInputDialog("Digite o quarto número: "));
            MostraValores();
            }
    }
    
    static void MostraValores(){
        if (n4<n1){
            JOptionPane.showMessageDialog(null, "Os números digitados em ordem crescente são: " +n4 +", " +n1 +", " +n2 +", " +n3);
        }
            else{
                if(n4<n2 && n4>n1){
                    JOptionPane.showMessageDialog(null, "Os números digitados em ordem crescente são: " +n1+", " +n4 +", " +n2 +", " +n3);
                }
                else{
                    if(n4<n3 && n4>n2){
                        JOptionPane.showMessageDialog(null, "Os números digitados em ordem crescente são: " +n1 +", " +n2 +", " +n4 +", " +n3);
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Os números digitados em ordem crescente são: " +n1 +", " +n2 +", " +n3 +", " +n4);
                    }
                }
            }
    }
}
