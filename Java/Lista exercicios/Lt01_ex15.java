/*
	15.	Receba os valores de 2 catetos de um triângulo retângulo. Calcule e mostre a hipotenusa
*/
import javax.swing.JOptionPane;
import java.lang.Math;
public class Lt01_ex15{
	public static void main(String args[]){
		double cateto1, cateto2, hipotenusa;
		cateto1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro cateto: "));
		cateto2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo cateto: "));
		hipotenusa = Math.sqrt((cateto1*cateto1)+(cateto2*cateto2));
		JOptionPane.showMessageDialog(null, "O valor da hipotenusa é: " +hipotenusa);
	}
}