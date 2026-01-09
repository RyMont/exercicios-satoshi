/*
    1/1 + 1/2 + 1/3 + ... + 1/n
*/
import javax.swing.JOptionPane;
public class recursiva3 {
    public static void main(String args[]){
        JOptionPane.showMessageDialog(null, RecursivaSerie(3));
    }
    
    static double RecursivaSerie(int n){
        double soma;
        soma =0;
        if (n==1){
            return 1;
        }
        else{
            soma = 1/n + 1/RecursivaSerie(n-1);
            return soma;
        }
    }
}
