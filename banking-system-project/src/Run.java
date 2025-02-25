import com.br.models.ContaModel;
import com.br.views.CriarContaView;
import com.br.views.MenuOpcoesView;

import com.br.controllers.CriaContaController;

import javax.swing.*;

public class Run {
    public static void main(String[] args) {
        boolean validador = true;
        while(validador) {
            int alternativa = MenuOpcoesView.menuOpcoes();
            switch (alternativa) {
                case 0: {
                    MenuOpcoesView.programaEncerrado();
                    validador = false;
                    break;
                }
                case 1: {
                    CriarContaView.novaConta();
                    break;
                }
                case 2: {

                }
                default: {
                    JOptionPane.showMessageDialog(null, "Opção inválida", "Tenta novamente", JOptionPane.INFORMATION_MESSAGE);
                }

            }
        }
    }
}