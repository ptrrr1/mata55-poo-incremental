package com.ufber.classes;

import java.util.ArrayList;
import java.util.List;

import com.ufber.abstractions.Corrida;

public class CorridaCarona extends Corrida {
    private List<Cliente> passageiros;

    public CorridaCarona(Trajeto trajeto, Cliente cliente) {
        super(trajeto, cliente);
        this.passageiros = new ArrayList<>();
        this.passageiros.add(cliente); // The requesting client is the first passenger
    }

    public void adicionarPassageiro(Cliente passageiro) {
        passageiros.add(passageiro);
    }

    @Override
    public double calcularValor() {
        return 0.0 / passageiros.size(); // TBD
    }

    public List<Cliente> getPassageiros() {
        return new ArrayList<>(passageiros);
    }
}