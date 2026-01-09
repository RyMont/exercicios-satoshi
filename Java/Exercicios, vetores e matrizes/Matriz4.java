/*
    
*/
public class Matriz4 {
    public static void main(String args[]){
        Util m = new Util();
        int LinhasMatriz = 8;
        int ColunasMatriz = 8;
        int mt[][] = new int[LinhasMatriz][ColunasMatriz];
        mt = m.Matriz4(mt, LinhasMatriz);
        m.mostraMatriz(mt, LinhasMatriz, ColunasMatriz);
    }
}
    