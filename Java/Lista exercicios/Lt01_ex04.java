/*
    Converter temperatura
 */
import javax.swing.JOptionPane;
public class Lt01_ex04 {
    public static void main (String args[]){
        double cel, fah;
        cel = Double.parseDouble(JOptionPane.showInputDialog("Digite a temperatura em celsius: "));
        fah = ((9*cel)+160)/5;
        JOptionPane.showMessageDialog(null, "A temperatura em fahrenheit é: "+fah);
    }
}
