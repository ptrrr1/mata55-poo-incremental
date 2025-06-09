package Sistema.Corrida;

import java.time.LocalDateTime;

import Sistema.Usuario.Cliente;
import Sistema.Usuario.Motorista;
import Sistema.Corrida.Trajeto.Endereco;
import Sistema.Corrida.Trajeto.Trajeto;
import Sistema.Enums.StatusCorrida;
import Sistema.Enums.TipoContrato;
import Sistema.Veiculo.Moto;
import Sistema.Veiculo.Carro;

public abstract class Corrida {
    protected LocalDateTime dataHora;
    protected Trajeto trajeto;
    protected StatusCorrida status;
    protected Motorista motorista;
    protected Cliente cliente;

    public Corrida(Trajeto trajeto, Cliente cliente) {
        this.dataHora = LocalDateTime.now();
        this.trajeto = trajeto;
        this.status = StatusCorrida.SOLICITADA;
        this.cliente = cliente;
    }

    public abstract double calcularValor();

    public LocalDateTime getDataHora() {
        return this.dataHora;
    }
    
    public Trajeto getTrajeto() {
        return this.trajeto;
    }

    public Endereco getOrigem() {
        return this.trajeto.getOrigem();
    }

    public Endereco getDestino() {
        return this.trajeto.getDestino();
    }

    public double getDistancia() {
        return this.trajeto.getDistancia();
    }

    public StatusCorrida getStatus() {
        return this.status;
    }

    public void setStatus(StatusCorrida status) {
        this.status = status;
    }

    public Motorista getMotorista() {
        return this.motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    public Cliente getCliente() {
        return this.cliente;
    }
    
    protected double getFatorDeCorrida(TipoContrato tipoCorrida) {
        double fator = 0.0;
        
        switch(tipoCorrida) {
            case PRO_LABORE:
                if (this.motorista.getVeiculo() instanceof Moto) {
                    fator = 1.0;
                } else {
                    fator = 1.3;
                }
                break;
            case ENTREGA:
                if (this.motorista.getVeiculo() instanceof Moto) {
                    fator = 0.5;
                } else {
                    fator = 0.8;
                }
                break;
            case CARONA:
                break;
        }
        return fator;
    }
    
    public boolean equals(Corrida c) {
        return this.trajeto.equals(c.getTrajeto()) &&
                this.motorista.equals(c.getMotorista()) && 
                this.cliente.equals(c.getCliente()) &&
                this.dataHora.isEqual(c.getDataHora());
    }
}
