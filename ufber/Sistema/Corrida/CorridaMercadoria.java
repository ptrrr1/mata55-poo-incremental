package Sistema.Corrida;

import Sistema.Corrida.Trajeto.Trajeto;
import Sistema.Usuario.Cliente;
import Sistema.Enums.Tamanho;
import Sistema.Enums.TipoContrato;

public class CorridaMercadoria extends Corrida {
    private String descricaoItem;
    private Tamanho tamanho;

    public CorridaMercadoria(Trajeto trajeto, Cliente cliente, String descricaoItem, Tamanho tamanho) {
        super(trajeto, cliente);
        this.descricaoItem = descricaoItem;
        this.tamanho = tamanho;
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
