/*
Criar e coletar um vetor [50] inteiro. Calcular e exibir:

a. A média dos valores entre 10 e 200;

b. A soma dos números ímpares.
*/
import javax.swing.JOptionPane;
public class Vetor1 {
    public static void main(String args[]){
	int Vetor[] = new int[50];
        Vetor = CarregaVetor(Vetor);
        MostrarBagulhos(Vetor);
    }

    static int[] CarregaVetor(int vt[]){
        int ctd;
        for(ctd=0; ctd<50; ctd++){
            vt[ctd] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor: "));
        }
        return vt;
    }
    
    static void MostrarBagulhos(int vet[]){
        int SomaImpares, SomaEntre10e200, ctd;
        SomaImpares = 0;
        SomaEntre10e200 = 0;
        ctd = 0;
        for (ctd=0; ctd<50; ctd++){
                if (vet[ctd]%2!=0){
                    SomaImpares += vet[ctd];
                }
                if (vet[ctd]>=10 && vet[ctd]<=200){
                    SomaEntre10e200 += vet[ctd];
                }
        }
        JOptionPane.showMessageDialog(null, SomaImpares);
        JOptionPane.showMessageDialog(null, SomaEntre10e200);
    }
}
