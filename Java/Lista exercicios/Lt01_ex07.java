/*
    Volume paralelepipedo
 */
import javax.swing.JOptionPane;
public class Lt01_ex07 {
    public static void main (String args[]){
        double comp, larg, alt, vol;
        comp = Double.parseDouble(JOptionPane.showInputDialog("Digite o comprimento do paralelepípedo: "));
        larg = Double.parseDouble(JOptionPane.showInputDialog("Digite a largura do paralelepípedo: "));
        alt = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do paralelepípedo: "));
        vol = comp * larg * alt;
        JOptionPane.showMessageDialog(null, "O volume do paralelepípedo é: "+vol);
    }
}
