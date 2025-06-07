package Corrida;

import Corrida.Trajeto.Trajeto;
import Usuario.Cliente;
import Enums.TipoContrato;

public class CorridaPassageiro extends Corrida {
    private int quantidadePassageiros;

    public CorridaPassageiro(Trajeto trajeto, Cliente cliente, int quantidadePassageiros) {
        super(trajeto, cliente);
        this.quantidadePassageiros = quantidadePassageiros;
    }
    
    public double calcularValor() {
        return this.trajeto.getDistancia() * this.getFatorDeCorrida(TipoContrato.PRO_LABORE);
    }

    public int getQuantidadePassageiros() {
        return quantidadePassageiros;
    }
}