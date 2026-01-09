/*
    Reajuste salario
 */
import javax.swing.JOptionPane;
public class Lt01_ex02 {
    public static void main (String args[]){
        double salario, reajuste;
        salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário: "));
        reajuste = salario*1.15;
        JOptionPane.showMessageDialog(null, "O salário após o reajuste é: " +reajuste);
    }
}
