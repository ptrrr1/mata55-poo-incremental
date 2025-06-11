package Sistema.Corrida;

import java.time.LocalDateTime;
import java.util.ArrayList;

import Sistema.UFBER;
import Sistema.Corrida.Trajeto.Trajeto;
import Sistema.Usuario.Cliente;
import Sistema.Usuario.Motorista;
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
    
    protected ArrayList<Motorista> verificarMotoristas() {
        UFBER u = new UFBER();
        return u.encontrarMotoristas(TipoContrato.PRO_LABORE);
    }
    
    public double calcularValor() {
        return this.trajeto.getDistancia() * this.getFatorDeCorrida(TipoContrato.PRO_LABORE);
    }

    public int getQuantidadePassageiros() {
        return quantidadePassageiros;
    }
}
