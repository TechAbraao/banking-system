import com.br.models.ContaModel;
import com.br.views.CriarContaView;
import com.br.views.MenuOpcoesView;

import com.br.controllers.CriaContaController;

import com.br.models.ContaModel;

import javax.swing.*;
import java.util.Map;

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
                    Map<String, Object> novaContaProcess = CriarContaView.novaConta();
                    ContaModel nova_conta = (ContaModel) CriaContaController.criandoConta(novaContaProcess);
                    System.out.println(nova_conta.dadosBancarios());
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