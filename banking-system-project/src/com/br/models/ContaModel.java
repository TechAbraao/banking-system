package com.br.models;

import javax.swing.*;

public class ContaModel {
    private String titular;
    private double saldo = 0.0;
    private int numero;

    public ContaModel(String titular, int numero) {
        this.titular = titular;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "ContaModel{" +
                "titular='" + titular + '\'' +
                ", saldo=" + saldo +
                ", numero=" + numero +
                '}';
    }

    public int getNumero() {
        return this.numero;
    }
    public double getSaldo() {
        return this.saldo;
    }
    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    private String getTitular() {
        return this.titular;
    }
    public void deposito() {
        String valor = JOptionPane.showInputDialog(null, "Digite");
        double valor_convertido = Double.parseDouble(valor);
        if (valor_convertido > 0.0) {
            JOptionPane.showMessageDialog(null,"Teste", "Depósito Bancário", JOptionPane.INFORMATION_MESSAGE);
            setSaldo(valor_convertido);
        } else {
            System.out.printf("-> Impossível adicionar - (R$ %.2f)%n", valor_convertido);
        }
    }
    public void saque(double valor) {
        if (valor > 20.00 && valor <= getSaldo()) {
            System.out.printf("-> Saque de (R$ %.2f) realizado com sucesso.%n", valor);
            setSaldo(getSaldo() - valor);
        } else {
            System.out.printf("-> Impossível realizar o saque desse respectivo valor.%n");
        }
    }
    public boolean dadosBancarios() {
        String dados = String.format("Nome do Titular: %s\nSaldo: %s\nNúmero: %s", getTitular(), getSaldo(), getNumero());
        JOptionPane.showMessageDialog(null, dados, "Dados Bancários", JOptionPane.INFORMATION_MESSAGE);
        return false;
    }

}