/*
    Primeira sofrência :3
    Calcula area
 */
import javax.swing.JOptionPane;
public class Lt01_ex01 {
    public static void main (String args[]){
        int lado, area;
        lado =  Integer.parseInt(JOptionPane.showInputDialog("Digite o lado: "));
        area =  lado*lado;
        JOptionPane.showMessageDialog(null, "A área é: " +area);
    }
}