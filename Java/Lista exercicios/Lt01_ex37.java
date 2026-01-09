/*
    37.	Receba um número inteiro. Calcule e mostre a série de Fibonacci até o seu N’nésimo termo.
*/
import javax.swing.JOptionPane;
public class Lt01_ex37 {
    public static void main(String args[]){
        int n, serie, ctd, t1, t2, aux;
        t1 = 0;
        t2 = 1;
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        for (ctd=1; ctd<=n; ctd++){
            JOptionPane.showMessageDialog(null, t1);
            serie =  t1 + t2;
            aux = t1;
            t1 = t2;
            t2 = serie;
        }
    }
}
