/*
    31.	Calcule e mostre o quadrado dos números entre 10 e 150
*/
import javax.swing.JOptionPane;
public class Lt01_ex31 {
    public static void main(String args[]){
        int num;
        for(num=10; num<151;num++){
            JOptionPane.showMessageDialog(null,"O quadrado do número " +num +" é: " +num*num);
        }
    }
}
