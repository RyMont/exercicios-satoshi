/*
    Funções e procedimentos :3
*/
import javax.swing.JOptionPane;
public class Util {
    
    public double RecebeReal(){
        double Valor;
        Valor = Double.parseDouble(JOptionPane.showInputDialog("Digite um número real: "));
        return Valor;
    }
    
    public int RecebeInt(){
        int Valor;
        Valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um número real: "));
        return Valor;
    }
    
    public double[] ClassificaVetorDouble(double vt[], int tamanho){
        int ctd, ctd2;
        double temp;
        for (ctd=0; ctd<tamanho-1; ctd++){
            for (ctd2 = ctd+1; ctd2<tamanho; ctd2++){
                if (vt[ctd] > vt[ctd2]){
                    temp = vt[ctd];
                    vt[ctd] = vt[ctd2];
                    vt[ctd2] = temp;
                }
            }
        }
        return vt;
    }
    
    public void MostraVetorReal(int tamanho, double vt[]){
        int ctd;
        for (ctd=0; ctd<tamanho; ctd++){
            JOptionPane.showMessageDialog(null, "O vetor [" +ctd +"] é: " +vt[ctd]);
        }
    }
    
    public int[][] carregaMatriz(int carregada[][], int linhas, int colunas){
        int x, y;
        for (x=0; x<linhas; x++){
            for (y=0; y<colunas; y++){
                carregada[x][y] = Integer.parseInt(JOptionPane.showInputDialog("Digita o número: "));
            }
        }
        return carregada;
    }
    
    public void matriz1(int mat[][]){
        int CadaProduto[] = new int[3], Semana[] = new int[4], TotalMes, x, y;
        TotalMes = 0;
        for(x=0; x<4; x++){
            for (y=0; y<3; y++){
                CadaProduto[y] += mat[x][y];
                Semana[x] += mat[x][y];
                TotalMes += mat[x][y];
            }
        }
        for (x=0; x<4; x++){
            JOptionPane.showMessageDialog(null, "O total de itens vendidos na semana " +x +" foi: " +Semana[x]);
        }
        for (x=0; x<3; x++){
            JOptionPane.showMessageDialog(null, "O total do produto " +x +" vendido no mes foi: " +CadaProduto[x]);
        }
        JOptionPane.showMessageDialog(null, "O total de itens vendidos no mês foi: " +TotalMes);
    }
    
    public double[][] Matriz2(double mat[][]){
        int x, y;
        for (x=0; x<4; x++){
            for (y=0; y<4; y++){
                if (x==y){
                    mat[x][y] = Math.pow(4, x);
                }
                else{
                    mat[x][y] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor: "));
                }
            }
        }
        return mat;
    }
    
    public int[][] Matriz4(int mat[][], int linhas){
        int x, y, ctd, ctdInverso;
        ctd = 0;
        ctdInverso = 8;
        while (ctd!=(linhas/2)){
            for (x=ctd; x<ctdInverso; x++){
                for (y=ctd; y<ctdInverso; y++){
                    mat[x][y] += 1;
                }
            }
            ctd ++;
            ctdInverso --;
        }
        return mat;
    }
    public void mostraMatriz(int mt[][], int linhas, int colunas){
        int x, y;
        for (x=0; x<linhas; x++){
            for (y=0; y<colunas; y++){
                JOptionPane.showMessageDialog(null, "Mt[" +x +"][" +y +"] = " +mt[x][y]);
            }
        }
    }
    
        public void mostraMatrizDouble(double mt[][], int linhas, int colunas){
        int x, y;
        for (x=0; x<linhas; x++){
            for (y=0; y<colunas; y++){
                JOptionPane.showMessageDialog(null, "Mt[" +x +"][" +y +"] = " +mt[x][y]);
            }
        }
    }
}