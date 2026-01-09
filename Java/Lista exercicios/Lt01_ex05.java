/*
    Resolver equacao segundo grau
*/
import javax.swing.JOptionPane;
import java.lang.Math;
public class Lt01_ex05 {
    public static void main (String args[]){
        int a, b, c;
        double raiz1, raiz2, delta;
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite o coeficiente 'A': "));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite o coeficiente 'B': "));
        c = Integer.parseInt(JOptionPane.showInputDialog("Digite o coeficiente 'C': "));
        delta = (b*b)-(4*a*c);
        raiz1 = ((b*(-1))+Math.sqrt(delta))/(2*a);
        raiz2 = ((b*(-1))-Math.sqrt(delta))/(2*a);
        JOptionPane.showMessageDialog(null, "A primeira raiz é: "+raiz1);
        JOptionPane.showMessageDialog(null, "A primeira raiz é: "+raiz2);
    }
}
