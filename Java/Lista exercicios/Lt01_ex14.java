/*
	Receba 2 ângulos de um triângulo. Calcule e mostre o valor do 3º ângulo
*/
import javax.swing.JOptionPane;
public class Lt01_ex14{
	public static void main(String args[]){
		double angulo1, angulo2, angulo3;
		angulo1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro ângulo: "));
		angulo2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo ângulo: "));
		angulo3 = 180 - (angulo1 + angulo2);
		JOptionPane.showMessageDialog(null, "O valor do terceiro ângulo é: " +angulo3);
	}
}