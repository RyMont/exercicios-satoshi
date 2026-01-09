/*
    20.	Receba 3 coeficientes A, B, e C de uma equação do 2º grau da fórmula AX²+BX+C=0. Verifique e mostre a existência de raízes reais e se caso exista, calcule e mostre.
*/
import javax.swing.JOptionPane;
public class Lt01_ex20 {
    public static void main(String args[]){
        int a, b, c;
        double raiz1, raiz2, delta;
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite o coeficiente A: "));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite o coeficiente B: "));
        c = Integer.parseInt(JOptionPane.showInputDialog("Digite o coeficiente C: "));
        delta = Math.pow(b, 2) - 4*a*c;
        if (delta<0){
            JOptionPane.showMessageDialog(null, "Não existem raízes reais.");
        }
        else if(delta==0){
            raiz1 = (-b+Math.sqrt(delta))/2*a;
            JOptionPane.showMessageDialog(null, "A equação digitada tem 1 raiz real e esta é: " +raiz1);
            }
            else{
                raiz1 = (-b+Math.sqrt(delta))/2*a;
                raiz2 = (-b-Math.sqrt(delta))/2*a;
                JOptionPane.showMessageDialog(null, "A equação digitada tem 2 raízes reais e estas são: " +raiz1 +" e " +raiz2);
        }
    }
}
