package com.ufber.classes;

import com.ufber.abstractions.Corrida;

public class CorridaMercadoria extends Corrida {
    private String descricaoItem;
    private double peso;

    public CorridaMercadoria(Trajeto trajeto, Cliente cliente, String descricaoItem, double peso) {
        super(trajeto, cliente);
        this.descricaoItem = descricaoItem;
        this.peso = peso;
    }

    @Override
    public double calcularValor() {
        return 0.0; // TBD
    }

    public String getDescricaoItem() {
        return descricaoItem;
    }

    public double getPeso() {
        return peso;
    }
}