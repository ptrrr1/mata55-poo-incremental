package com.ufber.abstractions;

import java.time.LocalDateTime;

import com.ufber.classes.Cliente;
import com.ufber.classes.Motorista;
import com.ufber.classes.Endereco;
import com.ufber.classes.Trajeto;
import com.ufber.enums.StatusCorrida;

public abstract class Corrida {
    protected LocalDateTime dataHora;
    protected Endereco origem;
    protected Endereco destino;
    protected double distancia;
    protected StatusCorrida status;
    protected Motorista motorista;
    protected Cliente cliente;

    public Corrida(Trajeto trajeto, Cliente cliente) {
        this.dataHora = LocalDateTime.now();
        this.origem = trajeto.getOrigem();
        this.destino = trajeto.getDestino();
        this.distancia = trajeto.getDistancia();
        this.status = StatusCorrida.SOLICITADA;
        this.cliente = cliente;
    }

    public abstract double calcularValor();

    // Getters and Setters
    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public Endereco getOrigem() {
        return origem;
    }

    public Endereco getDestino() {
        return destino;
    }

    public double getDistancia() {
        return distancia;
    }

    public StatusCorrida getStatus() {
        return status;
    }

    public void setStatus(StatusCorrida status) {
        this.status = status;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    public Cliente getCliente() {
        return cliente;
    }
}
