package model.entities;

import model.Exception.SaqueException;

public class Account {

    private Integer numero;
    private String titular;
    private Double balanco;
    private Double limiteSaq;

    public Account() {
    }

    public Account(Integer numero, String titular, Double balanco, Double limiteSaq) {
        this.numero = numero;
        this.titular = titular;
        this.balanco = balanco;
        this.limiteSaq = limiteSaq;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Double getBalanco() {
        return balanco;
    }

    public void setBalanco(Double balanco) {
        this.balanco = balanco;
    }

    public Double getLimiteSaq() {
        return limiteSaq;
    }

    public void setLimiteSaq(Double limiteSaq) {
        this.limiteSaq = limiteSaq;
    }

    public void deposito(Double quantia) {
        balanco += quantia;
    }

    public void saque(Double quantia) {
        balanco -= quantia;
    }

    private void validarSaque(double quantia)  {
        if (quantia > getLimiteSaq()) {
            throw new SaqueException("O limite de saque foi atingido");
        }
        if (quantia > getBalanco()) {
            throw new SaqueException("Saldo insuficiente");
        }
    }


}
