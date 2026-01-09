/*
    n + n-1 + n-2 + ... + 1
*/
import javax.swing.JOptionPane;
public class recursiva2 {
    public static void main(String args[]){
        JOptionPane.showMessageDialog(null, SomaCoisada(100));
    }
    
    static int SomaCoisada(int n){
        int soma;
        soma = 0;
        if (n>0){
            soma = n + SomaCoisada(n-1);
            return soma;
        }
        else{
            return soma;
        }
    }
}
