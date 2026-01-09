/*
    38.	Receba 100 números inteiros reais. Verifique e mostre o maior e o menor valor. Obs.: somente valores positivos.
*/
import javax.swing.JOptionPane;
public class Lt01_ex38 {
    public static void main(String args[]){
        int n, maior, menor, ctd;
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        while(n<0){
            n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número positivo: "));
        }
        maior = n;
        menor = n;
        for (ctd=0; ctd<9; ctd++){
            n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
            while(n<0){
                n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número positivo: "));
            }
            if (n>maior){
                maior = n;
            }
            if (n<menor){
                menor = n;
            }
        }
    }
}
