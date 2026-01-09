/*
    17.	Calcule a quantidade de litros gastos em uma viagem, sabendo que o automóvel faz 12 km/l. Receber o tempo de percurso e a velocidade média.
*/
import javax.swing.JOptionPane;
public class ex17 {
    static double litros;
    public static void main(String args []){
        double tempo, vMedia;
        tempo = Double.parseDouble(JOptionPane.showInputDialog("Digite o tempo da viagem em horas: "));
        vMedia = Double.parseDouble(JOptionPane.showInputDialog("Digite a velocidade media da viagem em km: "));
        CalcLitros(tempo, vMedia);
        JOptionPane.showMessageDialog(null,"O total de litros gastos foi de: " +litros +" litros.");
    }
    static void CalcLitros(double time,double velocidade){
        double distancia;
        distancia = time * velocidade;
        litros = distancia /12;
    }
}