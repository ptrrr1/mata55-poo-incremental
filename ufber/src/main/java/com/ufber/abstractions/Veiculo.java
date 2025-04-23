package com.ufber.abstractions;

public abstract class Veiculo {
    protected String placa;
    protected String cor;
    protected String modelo;

    public Veiculo(String placa, String cor, String modelo) {
        this.placa = placa;
        this.cor = cor;
        this.modelo = modelo;
    }

    public abstract String getTipo();

    // Getters
    public String getPlaca() {
        return placa;
    }

    public String getCor() {
        return cor;
    }

    public String getModelo() {
        return modelo;
    }
}