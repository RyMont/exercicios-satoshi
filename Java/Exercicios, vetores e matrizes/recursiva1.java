/*
    1+2+3+...+100
*/
import javax.swing.JOptionPane;
public class recursiva1 {
    public static void main(String args[]){
        JOptionPane.showMessageDialog(null, SomaRecursiva(1));
    }
    
    static int SomaRecursiva(int num){
        int soma;
        soma = 0;
        if (num<=100){
            soma += num + SomaRecursiva(num+1);
            return soma ;
        }
        else{
            return soma;
        }
    }
}