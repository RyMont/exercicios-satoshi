/*
	Receba a quantidade de alimento em quilos. Calcule e mostre quantos dias durará esse alimento sabendo que a pessoa consome 50g ao dia.
*/
import javax.swing.JOptionPane;
public class Lt01_ex13{
	public static void main (String args []){
		double quantidade, dias;
		quantidade = (Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de comida em quilos: "))) * 1000;
		dias = quantidade / 50;
		JOptionPane.showMessageDialog(null, "A quantidade de quilos digitada durará " +dias +"dias.");
	}
}