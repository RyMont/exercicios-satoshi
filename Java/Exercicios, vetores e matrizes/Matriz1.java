/*
    8.	Criar e carregar uma matriz [4][3] inteiro com quantidade de produtos vendidos em 4 semanas. Calcular e exibir:
    a.	A quantidade de cada produto vendido no mês;
    b.	A quantidade de produtos vendidos por semana;
    c.	O total de produtos vendidos no mês.

*/
public class Matriz1 {
    public static void main(String args[]){
        int LinhasMatriz = 4;
        int ColunasMatriz = 3;
        Util m = new Util();
        int mat[][] = new int [LinhasMatriz] [ColunasMatriz];
        m.carregaMatriz(mat, LinhasMatriz, ColunasMatriz);
        m.matriz1(mat);
    }
}
