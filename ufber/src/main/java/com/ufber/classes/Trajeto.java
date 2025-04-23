package com.ufber.classes;

public class Trajeto {
    private Endereco origem;
    private Endereco destino;
    private double distancia; // in kilometers

    public Trajeto(Endereco origem, Endereco destino, double distancia) {
        this.origem = origem;
        this.destino = destino;
        this.distancia = distancia;
    }

    public double calcularTempoEstimado() {
        return 0.0; // TBD
    }

    // Getters
    public Endereco getOrigem() {
        return origem;
    }

    public Endereco getDestino() {
        return destino;
    }

    public double getDistancia() {
        return distancia;
    }
}