/*
	Calcular comprimento da circunferência
*/
import javax.swing.JOptionPane;
import java.lang.Math;
public class Lt01_ex11{
	public static void main (String args[]){
		double raio, comp;
		raio = Double.parseDouble(JOptionPane.showInputDialog("Digite o raio da circunferência: "));
		comp = 2 * Math.PI * raio;
		JOptionPane.showMessageDialog(null, "O comprimento da circunferencia de raio " +raio +" é: " +comp);
	}
}