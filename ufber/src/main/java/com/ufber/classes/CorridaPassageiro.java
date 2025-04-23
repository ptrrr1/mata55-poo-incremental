package com.ufber.classes;

import com.ufber.abstractions.Corrida;

public class CorridaPassageiro extends Corrida {
    private int quantidadePassageiros;

    public CorridaPassageiro(Trajeto trajeto, Cliente cliente, int quantidadePassageiros) {
        super(trajeto, cliente);
        this.quantidadePassageiros = quantidadePassageiros;
    }

    @Override
    public double calcularValor() {
        return 0.0; // TBD
    }

    public int getQuantidadePassageiros() {
        return quantidadePassageiros;
    }
}