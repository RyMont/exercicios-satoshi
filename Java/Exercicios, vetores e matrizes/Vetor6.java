/*
    6.	Criar e coletar em um vetor [20] com números aleatórios. Classificar este vetor em ordem crescente e mostre os dados.
*/
public class Vetor6 {
    public static void main(String args[]){
        //Instanciando classe
        Util m = new Util();
        
        //Criando variáveis
        int ctd, tamanhoVetor = 20;
        double vt[] = new double[tamanhoVetor];
        
        
        //Logica Principal
        //Coletar vetor
        for (ctd=0; ctd<tamanhoVetor; ctd++){
            vt[ctd] = m.RecebeReal();
        }
        
        //Organizar vetor
        vt = m.ClassificaVetorDouble(vt, tamanhoVetor);
        
        //Mostrar na tela
        m.MostraVetorReal(tamanhoVetor, vt);
    }
}
