package com.br.views;
import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class CriarContaView {
    public static Map<String, Object> novaConta() {

        String titular = JOptionPane.showInputDialog(null, "Digite o nome completo do titular: ", "Titular", JOptionPane.INFORMATION_MESSAGE);
        int numero = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o número da conta: ", "Titular", JOptionPane.INFORMATION_MESSAGE));
        Map<String, Object> conta = new HashMap<>();
        conta.put("titular", titular);
        conta.put("numero", numero);
        JOptionPane.showMessageDialog(null, "Nome do titular: " + conta.get("titular") + "\nNúmero da conta bancária: " + conta.get("numero"), "Conta criada com sucesso", JOptionPane.INFORMATION_MESSAGE);

        return conta;
    }
}
