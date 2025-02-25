package com.br.controllers;
import com.br.models.ContaModel;
import com.br.views.CriarContaView;

public class CriaContaController {
    public static Object criandoConta() {
        String titular = (String) CriarContaView.novaConta().get("titular");
        int numero = (int) CriarContaView.novaConta().get("numero");
        ContaModel nova_conta = new ContaModel(titular, numero);

        return nova_conta;
    }
};

