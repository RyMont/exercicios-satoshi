/*
	17.	Calcule a quantidade de litros gastos em uma viagem, sabendo que o automóvel faz 12 km/l. Receber o tempo de percurso e a velocidade média.
*/
import javax.swing.JOptionPane;
public class Lt01_ex17{
	public static void main(String args[]){
		double litros, tempo, vMedia;
		tempo = Double.parseDouble(JOptionPane.showInputDialog("Digite o tempo do percurso em horas: "));
		vMedia = Double.parseDouble(JOptionPane.showInputDialog("Digite a velocidade média: "));
		litros = (tempo * vMedia) / 12;
		JOptionPane.showMessageDialog(null, "O total de litros gastos na viagem foi: " +litros);
	}
}