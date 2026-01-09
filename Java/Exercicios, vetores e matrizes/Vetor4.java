/*
    4.	Criar e coletar em um vetor [30] real e calcular e exibir:
    a.	A média do grupo;
    b.	A quantidade de notas acima do grupo;
    c.	As posições dos valores abaixo da média do grupo.

*/

import javax.swing.JOptionPane;
public class Vetor4 {
    static int TamanhoVetor = 3;
    public static void main(String args[]){
        
        //Trazendo a classe de métodos
        Util m = new Util();
        
        //Definindo variáveis
        int media, NotasAcima, ctd;
        double vetor[] = new double[TamanhoVetor];
        NotasAcima = 0;
        media = 0;
        
        
        //Lógica Principal
        
        //Carregando o vetor
        for (ctd=0; ctd<TamanhoVetor; ctd++){
            vetor[ctd] = m.RecebeReal();
            media += vetor[ctd];
        }
        media = media/TamanhoVetor; //Fazendo a média
        //Ver notas acima do grupo
        for (ctd=0; ctd < TamanhoVetor; ctd++){
            if (vetor[ctd] > media){
                NotasAcima += 1;
            }
            if (vetor[ctd]<media){
                JOptionPane.showMessageDialog(null, "A posição " +ctd +" está abaixo da média.");
            }
        }
        //Mostrar na tela os coiso
        JOptionPane.showMessageDialog(null, "A quantidade de notas acima do grupo foi: " +NotasAcima);
    }
}
