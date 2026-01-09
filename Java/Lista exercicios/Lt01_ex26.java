/*
    26.	Receba 2 números inteiros. Verifique e mostre se o maior número é múltiplo do menor.
*/
import javax.swing.JOptionPane;
public class Lt01_ex26 {
    public static void main(String args[]){
        int maior, menor, temp;
        menor = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
        maior = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));
        if (maior<menor){
            temp = maior;
            maior = menor;
            menor = temp;
            }
        if (maior%menor==0){
            JOptionPane.showMessageDialog(null, "O maior número é multiplo do menor");
            }
        else{
            JOptionPane.showMessageDialog(null, "O maior número não é multiplo do menor");
        }
    }
}
