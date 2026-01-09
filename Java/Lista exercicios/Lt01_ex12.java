/*
	Receba o ano de nascimento e o ano atual. Calcule e mostre a sua idade e quantos anos terá daqui a 17 anos.
*/
import javax.swing.JOptionPane;
public class Lt01_ex12{
	public static void main (String args[]){
		int anoAtual, anoNasc, idadeFutura;
		anoNasc = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento: "));
		anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual: "));
		idadeFutura = (anoAtual - anoNasc) + 17;
		JOptionPane.showMessageDialog(null, "A idade daqui 17 anos será: "+idadeFutura +" anos.");
	}
}