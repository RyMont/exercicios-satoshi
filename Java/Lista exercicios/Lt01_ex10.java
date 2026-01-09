/*
	Calcular diferença entre 2 números reais
*/
import javax.swing.JOptionPane;
public class Lt01_ex10{
	public static void main (String args[]){
		double n1, n2, diff;
		n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número: "));
		n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número: "));
		diff = n1 - n2;
		JOptionPane.showMessageDialog(null, "A diferença entre o primeiro numero e o segundo é: "+diff);
	}
}