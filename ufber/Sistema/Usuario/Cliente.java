package Sistema.Usuario;

import java.util.ArrayList;
import java.util.List;

import Sistema.Corrida.Corrida;
import Sistema.Corrida.CorridaCarona;
import Sistema.Corrida.CorridaMercadoria;
import Sistema.Corrida.CorridaPassageiro;
import Sistema.Corrida.Trajeto.Trajeto;
import Sistema.Enums.TipoContrato;
import Sistema.Enums.Tamanho;

public class Cliente extends Usuario {
    private List<Corrida> historicoCorridas;
    private Trajeto trajeto;

    public Cliente(String nomeCompleto, String telefone, String cpf) {
        super(nomeCompleto, telefone, cpf);
        this.historicoCorridas = new ArrayList<>();
    }
    
    public Cliente(String nomeCompleto, String cpf) {
        super(nomeCompleto, cpf);
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
                corrida = new CorridaPassageiro(trajeto, this, 1);
                break;
            case CARONA:
                corrida = new CorridaCarona(trajeto, this);
                break;
            case ENTREGA:
                corrida = new CorridaMercadoria(trajeto, this, "Item não especificado", Tamanho.PEQUENO);
                break;
        }
            
        this.historicoCorridas.add(corrida);
        return corrida;
    }
    
    public Corrida solicitarCorrida(TipoContrato tipoCorrida) {
        return this.solicitarCorrida(this.trajeto, tipoCorrida);
    }
    
    public void selecionarTrajeto(Trajeto trajeto) {
        this.trajeto = trajeto;
    }
    /*    
    public void avaliarMotorista(Motorista motorista, int rating) {
        System.out.println("Motorista " + motorista.getNomeCompleto() + " avaliado com " + rating + " estrelas");
    }
    */ 
    public List<Corrida> getHistoricoCorridas() {
        return new ArrayList<>(this.historicoCorridas);
    }
}
