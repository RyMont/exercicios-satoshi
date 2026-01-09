/*
28.	Receba o preço atual e a média mensal de um produto. Calcule e mostre o novo preço sabendo que:
Venda Mensal	Preço Atual	Preço Novo
< 500	        < 30	        +10%
>= 500 e < 1000	>= 30 e < 80	+15%
>= 1000	        >= 80	        -5%
Obs.: para outras condições, preço novo será igual ao preço atual.

*/
import javax.swing.JOptionPane;
public class Lt01_ex28 {
    public static void main(String args[]){
    double precoAtual, precoFuturo, mediaMensal;
    precoAtual = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço atual: "));
    mediaMensal = Double.parseDouble(JOptionPane.showInputDialog("Digite a média mensal de vendas: "));
    if (mediaMensal<500 && precoAtual<30){
        precoFuturo = precoAtual * 1.1;
        }
    else if (mediaMensal>=500 && mediaMensal<1000 && precoAtual>=30 && precoAtual<80){
            precoFuturo = precoAtual * 1.15;
            }
        else if (mediaMensal>=1000 && precoAtual>=80){
            precoFuturo = precoAtual * 0.95;
        }
            else{
                precoFuturo = precoAtual;
            }
    JOptionPane.showMessageDialog(null, "O novo preço será: " +precoFuturo);
    }
}
