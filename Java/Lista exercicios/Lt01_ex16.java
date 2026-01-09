/*
	Receba a quantidade de horas trabalhadas, o valor por hora, o percentual de desconto e o número de descendentes. Calcule o salário que serão as horas 	trabalhadas x o valor por hora. Calcule o salário líquido (= Salário Bruto – desconto). A cada dependente será acrescido R$ 100 no Salário Líquido. Exiba o 	salário a receber.
*/
import javax.swing.JOptionPane;
public class Lt01_ex16{
	public static void main(String args[]){
		double hrsTrabalhadas, valorHora, desconto, salBruto, salLiquido;
		int descendentes;
		hrsTrabalhadas = Double.parseDouble(JOptionPane.showInputDialog("Digite o número de horas trabalhadas: "));
		valorHora = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor/hora: "));
		desconto = Double.parseDouble(JOptionPane.showInputDialog("Digite o percentual de desconto (sem o símbolo de %): "));
		descendentes = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de descendentes: "));
		salBruto = hrsTrabalhadas * valorHora;
		desconto = salBruto * (desconto/100);
		salLiquido = (salBruto - desconto) + (100 * descendentes);
		JOptionPane.showMessageDialog(null, "O salário liquido é: " +salLiquido);
	}
}