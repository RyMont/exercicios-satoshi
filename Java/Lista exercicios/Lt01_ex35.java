/*
    35.	Receba 2 números inteiros, verifique qual o maior entre eles. Calcule e mostre o resultado da somatória dos números ímpares entre esses valores.
*/
import javax.swing.JOptionPane;
public class Lt01_ex35 {
    public static void main(String args[]){
        int maior, menor, temp, soma;
        maior = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        menor = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número: "));
        if(menor>maior){
            temp = maior;
            maior = menor;
            menor = temp;
        }
        soma = 0;
        for(temp=menor; temp<maior; temp++){
            if(temp%2!=0){
            soma += temp;
            }
        }
        JOptionPane.showMessageDialog(null, "O menor número digitado foi: "+menor);
        JOptionPane.showMessageDialog(null, "O maior número digitado foi: "+maior);
        JOptionPane.showMessageDialog(null, "A soma dos numéros impares entre os números digitados é: "+soma);
    }
}
