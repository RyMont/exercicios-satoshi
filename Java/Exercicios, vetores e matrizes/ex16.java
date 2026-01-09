/*
    	Receba a quantidade de horas trabalhadas, o valor por hora, o percentual de desconto e o número de descendentes. Calcule o salário que serão as horas 	trabalhadas x o valor por hora. Calcule o salário líquido (= Salário Bruto – desconto). A cada dependente será acrescido R$ 100 no Salário Líquido. Exiba o 	salário a receber.
*/
import javax.swing.JOptionPane;
public class ex16 {
    static double salLiquido;
    public static void main(String args[]){
        double hrsTrabalhadas, valorHora, desconto;
	int descendentes;
	hrsTrabalhadas = Double.parseDouble(JOptionPane.showInputDialog("Digite o número de horas trabalhadas: "));
	valorHora = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor/hora: "));
	desconto = 1 - (Double.parseDouble(JOptionPane.showInputDialog("Digite o percentual de desconto (sem o símbolo de %): "))/100);
	descendentes = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de descendentes: "));
        CalcSal(hrsTrabalhadas, valorHora, desconto, descendentes);
	JOptionPane.showMessageDialog(null, "O salário liquido é: " +salLiquido);
    }


static void CalcSal(double hrs,double vHr,double discount,int filhos){
    double salBruto;
    salBruto = vHr * hrs;
    salLiquido = (salBruto * discount) + (filhos * 100);
    }
}