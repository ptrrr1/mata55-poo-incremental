package Sistema.Corrida;

import java.time.LocalDateTime;

import Sistema.Corrida.Trajeto.Trajeto;
import Sistema.Usuario.Cliente;
import Sistema.Enums.Tamanho;
import Sistema.Enums.TipoContrato;

public class CorridaMercadoria extends Corrida {
    private String descricaoItem;
    private Tamanho tamanho;
    private Cliente destinatario;

    public CorridaMercadoria(Trajeto trajeto, Cliente remetente, Cliente destinatario, String descricaoItem, Tamanho tamanho) {
        super(trajeto, remetente);
        this.descricaoItem = descricaoItem;
        this.tamanho = tamanho;
        this.destinatario = destinatario;
    }
    
    public CorridaMercadoria(Trajeto trajeto, Cliente remetente, Cliente destinatario, String descricaoItem, Tamanho tamanho, LocalDateTime hora) {
        super(trajeto, remetente, hora);
        this.descricaoItem = descricaoItem;
        this.tamanho = tamanho;
        this.destinatario = destinatario;
    }

    public double calcularValor() {
        return this.trajeto.getDistancia() * this.getFatorDeCorrida(TipoContrato.ENTREGA);
    }
    
    public String getDescricaoItem() {
        return this.descricaoItem;
    }

    public Tamanho getTamanho() {
        return this.tamanho;
    }
}
