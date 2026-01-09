/*
    Area triangulo
 */
import javax.swing.JOptionPane;
public class Lt01_ex03 {
    public static void main (String args[]){
    double base, altura, area;
    base = Double.parseDouble(JOptionPane.showInputDialog("Digite a base do triângulo: "));
    altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do triângulo: "));
    area = (base*altura)/2;
    JOptionPane.showMessageDialog(null, "A área do triângulo é: "+area);
    }
}
