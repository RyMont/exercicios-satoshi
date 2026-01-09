/*
    23.	Receba 3 valores obrigatoriamente em ordem crescente e um 4º valor não necessariamente em ordem. Mostre os 4 números em ordem crescente.
*/
import javax.swing.JOptionPane;
public class Lt01_ex23 {
    public static void main(String args[]){
        double n1, n2, n3, n4;
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número: "));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número: "));
        if (n2<n1 || n2==n1){
            JOptionPane.showMessageDialog(null, "O numero digitado é menor que o anterior.");
            }
        else{
            n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro número: "));
            if (n3<n2 || n3==n2){
                JOptionPane.showMessageDialog(null, "O numero digitado é menor que o anterior.");
                }
            else{
                n4 = Double.parseDouble(JOptionPane.showInputDialog("Digite o quarto número: "));
                if(n4<n1){
                    JOptionPane.showMessageDialog(null, "Os numeros em ordem crescente são: "+n4 +", " +n1 +", " +n2 +", " +n3);
                    }
                else if(n4<n2){
                    JOptionPane.showMessageDialog(null, "Os numeros em ordem crescente são: "+n1 +", " +n4 +", " +n2 +", " +n3);
                    }
                    else if(n4<n3){
                        JOptionPane.showMessageDialog(null, "Os numeros em ordem crescente são: "+n1 +", " +n2 +", " +n4 +", " +n3);
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "Os numeros em ordem crescente são: "+n1 +", " +n2 +", " +n3 +", " +n4);
                            }
                    
                }
        }
    }
}
