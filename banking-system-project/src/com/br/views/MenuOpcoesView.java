package com.br.views;

import javax.swing.*;

public class MenuOpcoesView {
    public static int menuOpcoes() {

        String mensagem = """
                \n
                [0] Fechar sistema bancário
                [1] Criar nova conta
                [2] Buscar conta
                [...] Em construção
                \n
                """;

        int alternativa = Integer.parseInt(JOptionPane.showInputDialog(null, mensagem, "Menu de Opções - Nexus Bank", JOptionPane.INFORMATION_MESSAGE));

        return alternativa;
    }
    public static void programaEncerrado() {
        JOptionPane.showMessageDialog(null, "Obrigado, até a próxima!", "Programa encerrado com sucesso!", JOptionPane.INFORMATION_MESSAGE);
    }
}
