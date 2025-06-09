package Sistema.Corrida;

import java.time.LocalDateTime;

import Sistema.Corrida.Trajeto.Trajeto;
import Sistema.Usuario.Cliente;
import Sistema.Enums.TipoContrato;

public class CorridaPassageiro extends Corrida {
    private int quantidadePassageiros;

    public CorridaPassageiro(Trajeto trajeto, Cliente cliente, int quantidadePassageiros) {
        super(trajeto, cliente);
        this.quantidadePassageiros = quantidadePassageiros;
    }
    
    public CorridaPassageiro(Trajeto trajeto, Cliente cliente, int quantidadePassageiros, LocalDateTime hora) {
        super(trajeto, cliente, hora);
        this.quantidadePassageiros = quantidadePassageiros;
    }
    
    public double calcularValor() {
        return this.trajeto.getDistancia() * this.getFatorDeCorrida(TipoContrato.PRO_LABORE);
    }

    public int getQuantidadePassageiros() {
        return quantidadePassageiros;
    }
}
