/*
    n/1 + n-1/2 + n-2/3 + ... + 1/n
*/
import javax.swing.JOptionPane;
public class recursiva4 {
    public static void main(String args[]){
        JOptionPane.showMessageDialog(null, Soma4(2, 1));
    }
    
    static float Soma4(float num, float den){
        float soma;
        soma = 0;
        if (num!=1){
            soma = (num/den) + Soma4(num-1, den+1);
            return soma;
        }
        else{
            return 1;
        }
    }
}
