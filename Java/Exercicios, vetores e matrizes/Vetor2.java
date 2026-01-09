/*
    2.	Criar e coletar um vetor [100] inteiro e exibir:
    a.	O maior e o menor valor;
    b.	A média dos valores.

*/
import javax.swing.JOptionPane;
public class Vetor2 {
    static int TamanhoVetor = 5;
    public static void main(String args[]){
        
        //Insntaciando Classe
        Util m = new Util();
        
        //Criando Variáveis
        int vt[] = new int[TamanhoVetor], ctd, maior, menor;
        double media = 0;
        
        
        
        //Logica principal
        //Carregar vetor
        vt[0] =  m.RecebeInt();
        menor = vt[0];
        maior = vt[0];
        media = vt[0];
        for (ctd=1; ctd < TamanhoVetor; ctd++){
            vt[ctd] = m.RecebeInt();
                if (vt[ctd] < menor){
                    menor = vt[ctd];
                }
                if (vt[ctd] > maior){
                    maior = vt[ctd];
                }
            media += vt[ctd];
        }
        media = media/TamanhoVetor;                                             //Calcular media
        
        
        //Mostrar na tela
        JOptionPane.showMessageDialog(null, "O menor valor foi: " +maior);
        JOptionPane.showMessageDialog(null, "O menor valor foi: " +menor);
        JOptionPane.showMessageDialog(null, "A media dos números digitados foi: " +media);
    }
}