/*
    20.	Receba 3 coeficientes A, B, e C de uma equação do 2º grau da fórmula AX²+BX+C=0. Verifique e mostre a existência de raízes reais e se caso exista, calcule e mostre.
*/
import javax.swing.JOptionPane;
public class ex20 {
    static double raiz1, raiz2, delta;
    public static void main(String args[]){
        double a, b, c;
        a = Double.parseDouble(JOptionPane.showInputDialog("Digite o coeficiente A: "));
        b = Double.parseDouble(JOptionPane.showInputDialog("Digite o coeficiente B: "));
        c = Double.parseDouble(JOptionPane.showInputDialog("Digite o coeficiente C: "));
        CalcularDelta(a, b, c);
        if (delta<0){
            JOptionPane.showMessageDialog(null, "Os a equação digitada não possui raízes reais.");
            }
        else{
            CalcularRaízes(a, b, c);
            if (delta==0){
                    JOptionPane.showMessageDialog(null,"A equação possui 1 raiz real, sendo ela: " +raiz1);
                }
            else{
                JOptionPane.showMessageDialog(null, "A equação possui 2 raiz reais, sendo elas: " +raiz1 +" e " +raiz2 );
                }
            }
    }
    
    static void CalcularDelta(double a, double b, double c){
        delta = (b*b)-(4*a*c);
    }
    
    static void CalcularRaízes(double a, double b, double c){
        raiz1 = (-b + Math.sqrt(delta))/ 2*a;
        raiz2 = (-b - Math.sqrt(delta))/ 2*a;
    }
}