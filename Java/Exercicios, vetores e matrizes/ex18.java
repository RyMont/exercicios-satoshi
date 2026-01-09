/*
    18.	Receba 2 valores inteiros. Calcule e mostre o resultado da diferença do maior pelo menos valor.
 */
import javax.swing.JOptionPane;
public class ex18 {
    static int diff;
    public static void main(String args[]){
        int n1, n2;
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));
        MenorMenosMaior(n1, n2);
        JOptionPane.showMessageDialog(null,"A diferença do maior número digitado pelo menor é: "+diff);
    }
    static void MenorMenosMaior(int menor,int maior){
        int temp;
        if (menor>maior){
            temp = menor;
            menor = maior;
            maior = temp;
        }
        diff = maior - menor;
    }
}
