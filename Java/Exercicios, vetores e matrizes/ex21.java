/*
    21.	Receba 4 notas bimestrais de um aluno. Calcule e mostre a média aritmética. Mostre a mensagem de acordo com a média:
    a.	Se a média for >= 6,0 exibir “APROVADO”;
    b.	Se a média for >= 3,0 ou < 6,0 exibir “EXAME”;
    c.	Se a média for < 3,0 exibir “RETIDO”.

*/
import javax.swing.JOptionPane;
public class ex21 {
    static double media;
    public static void main(String args[]){
            CalculaMedia();
            MensagemMedia();
        }
    
    static void MensagemMedia(){
        if (media>=6){
            JOptionPane.showMessageDialog(null, "Aprovado.");
            }
            else if(media>=3){
                JOptionPane.showMessageDialog(null, "Exame.");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Retido.");
                }
        }
    
    static void CalculaMedia(){
        int n1, n2, n3, n4;
        n1 =  Integer.parseInt(JOptionPane.showInputDialog("Digite a primeira nota: "));
        n2 =  Integer.parseInt(JOptionPane.showInputDialog("Digite a segunda nota: "));
        n3 =  Integer.parseInt(JOptionPane.showInputDialog("Digite a terceira nota: "));
        n4 =  Integer.parseInt(JOptionPane.showInputDialog("Digite a quarta nota: "));
        media = (n1+n2+n3+n4)/4;
        }
}
