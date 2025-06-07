package Corrida;

import java.util.ArrayList;
import java.util.List;

import Corrida.Trajeto.Trajeto;
import Usuario.Cliente;

public class CorridaCarona extends Corrida {
    private List<Cliente> passageiros;

    public CorridaCarona(Trajeto trajeto, Cliente cliente) {
        super(trajeto, cliente);
        this.passageiros = new ArrayList<>();
        this.passageiros.add(cliente);
    }

    public void adicionarPassageiro(Cliente passageiro) {
        passageiros.add(passageiro);
    }

    public double calcularValor() {
        return 0.0;
    }

    public List<Cliente> getPassageiros() {
        return new ArrayList<>(passageiros);
    }
}