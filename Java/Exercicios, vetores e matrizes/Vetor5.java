
import javax.swing.JOptionPane;

/*
    5.	Criar e coletar em um vetor [20] inteiro. Calcule e exiba, segundo:

    10
    ∑ (A[1] – A[21–1])
    i = 1

*/
public class Vetor5 {
    static int TamanhoVetor = 20;
    public static void main(String args[]){
        //Instanciando Classe
        Util m = new Util();
        
        //Carregando vetor
        int vt[] = new int[TamanhoVetor], soma = 0, ctd;
        
        //Carregando vetor
        for (ctd=0; ctd<TamanhoVetor; ctd++){
            vt[ctd] = m.RecebeInt();
        }
        //Fazer o somátorio
        for (ctd=0; ctd<(TamanhoVetor/2); ctd++){
            soma += vt[ctd] - vt[19-ctd];
        }
        
        //Mostrar na tela
        JOptionPane.showMessageDialog(null, "O somatorio teve como resultado " +soma);
    }
}
