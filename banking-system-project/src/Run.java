import com.br.models.Conta;
import javax.swing.*;

public class Run {
    public static void main(String[] args) {
        Conta abraao = new Conta("Abraão", 123456789);
        Conta leandro = new Conta("Leandro", 987654321);
        while(true) {
            int alternativa = Integer.parseInt(JOptionPane.showInputDialog("-> Digite a opção que deseja: "));
        }
    }
}