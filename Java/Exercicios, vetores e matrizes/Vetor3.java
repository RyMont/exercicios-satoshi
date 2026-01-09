/*
    Criar e coletar valores inteiros nos vetores VT1[3] e VT2[3]. 
    Concatenar esses valores em um 3º vetor (VT3[6]) e mostrar os seus dados.
*/
import javax.swing.JOptionPane;
public class Vetor3 {
    public static void main(String args[]){
        int vt1[] = new int[3];
        int vt2[] = new int[3];
        int vt3[] = new int[6];
        vt1 = CarregaVetor(vt1);
        vt2 = CarregaVetor(vt2);
        vt3 = AjudaDeus(vt3, vt1, vt2);
        
    }
    
    public static int[] CarregaVetor(int vt[]){
        int ctd;
        for (ctd=0; ctd<3; ctd++){
            vt[ctd] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor: "));
        }
        return vt;
    }
    
    public static int[] AjudaDeus(int vt[], int vt1[], int vt2[]){
        int ctd;
        for (ctd=0; ctd<3; ctd++){
            vt[ctd] = vt1[ctd];
        }
        for (ctd = 0; ctd<3; ctd++){
            vt[ctd+3] = vt2[ctd];
        }
        return vt;
    }
}
