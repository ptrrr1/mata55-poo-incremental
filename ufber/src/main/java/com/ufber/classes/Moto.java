package com.ufber.classes;

import com.ufber.abstractions.Veiculo;

public class Moto extends Veiculo {
    private boolean possuiBau;

    public Moto(String placa, String cor, String modelo, boolean possuiBau) {
        super(placa, cor, modelo);
        this.possuiBau = possuiBau;
    }

    @Override
    public String getTipo() {
        return "Moto";
    }

    public boolean isPossuiBau() {
        return possuiBau;
    }
}