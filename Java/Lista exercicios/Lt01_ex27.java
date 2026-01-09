/*
    27.	Receba o número de voltas, a extensão do circuito (em metros) e o tempo de duração (minutos). Calcule e mostre a velocidade média em km/h.
*/
import javax.swing.JOptionPane;
public class Lt01_ex27 {
    public static void main(String args[]){
    double metros, minutos, vMedia;
    metros = Double.parseDouble(JOptionPane.showInputDialog("Digite a extensão do circuito: "));
    minutos = Double.parseDouble(JOptionPane.showInputDialog("Digite a duração em minutos: "));
    vMedia = (metros/(minutos*60))*3.6;
    JOptionPane.showMessageDialog(null, "A velocidade média foi: " +vMedia +"km/h");
    }
}
