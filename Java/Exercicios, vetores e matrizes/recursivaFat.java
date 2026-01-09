/*
    recursiva fatorial
*/
import javax.swing.JOptionPane;
public class recursivaFat {
    public static void main(String args[]){
        JOptionPane.showMessageDialog(null, Fatorial(Integer.parseInt((JOptionPane.showInputDialog("Digite um número: ")))));
    }
    
    static int Fatorial(int n){
        int fat;
        if (n>1){
            fat = n*Fatorial(n-1);
            return fat;
        }
        else{
            return n;
        }
    }
}