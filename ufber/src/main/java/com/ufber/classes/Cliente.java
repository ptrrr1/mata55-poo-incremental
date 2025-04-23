package com.ufber.classes;

import java.util.ArrayList;
import java.util.List;

import com.ufber.abstractions.Corrida;
import com.ufber.abstractions.Usuario;
import com.ufber.enums.TipoContrato;

public class Cliente extends Usuario {
    private List<Corrida> historicoCorridas;

    public Cliente(String nomeCompleto, String telefone, String cpf) {
        super(nomeCompleto, telefone, cpf);
        this.historicoCorridas = new ArrayList<>();
    }

    @Override
    public void cadastrar() {
        System.out.println("Cliente " + nomeCompleto + " cadastrado com sucesso!");
    }

    public Corrida solicitarCorrida(Trajeto trajeto, TipoContrato tipoCorrida) {
        Corrida corrida = null;
        
        switch(tipoCorrida) {
            case PRO_LABORE:
                corrida = new CorridaPassageiro(trajeto, this, 1); // Default 1 passenger
                break;
            case CARONA:
                corrida = new CorridaCarona(trajeto, this);
                break;
            case ENTREGA:
                corrida = new CorridaMercadoria(trajeto, this, "Item não especificado", 0.5); // Default 0.5kg
                break;
            }
            
            //historicoCorridas.add(corrida);
            return corrida;
    }
    
    public void avaliarMotorista(Motorista motorista, int rating) {
        // Implementation for rating a driver
        System.out.println("Motorista " + motorista.getNomeCompleto() + " avaliado com " + rating + " estrelas");
    }
    
    public List<Corrida> getHistoricoCorridas() {
        return new ArrayList<>(historicoCorridas);
    }
}
