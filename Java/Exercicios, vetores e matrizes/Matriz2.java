/* 
*/
public class Matriz2 {
    public static void main(String args []){
        int LinhasMatriz = 4;
        int ColunasMatriz = 4;
        Util m = new Util();
        double mat[][] = new double[LinhasMatriz][ColunasMatriz];
        mat=m.Matriz2(mat);
        m.mostraMatrizDouble(mat, LinhasMatriz, ColunasMatriz);
    }
}
