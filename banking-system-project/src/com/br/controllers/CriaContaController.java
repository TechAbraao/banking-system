package com.br.controllers;
import com.br.models.ContaModel;
import com.br.views.CriarContaView;

import java.util.Map;

public class CriaContaController {
    public static Object criandoConta(Map<String, Object> novaContaProcess) {

        String titular = (String) novaContaProcess.get("titular");
        int numero = (int) novaContaProcess.get("numero");

        ContaModel nova_conta = new ContaModel(titular, numero);
        return nova_conta;
    }
};

