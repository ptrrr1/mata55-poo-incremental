package Sistema.Usuario;

import java.util.ArrayList;
import java.util.List;

import Sistema.Corrida.Corrida;
import Sistema.Veiculo.Veiculo;
import Sistema.Enums.StatusCorrida;
import Sistema.Enums.TipoContrato;

public class Motorista extends Usuario {
    private TipoContrato tipoContrato;
    private Veiculo veiculo;
    private List<Corrida> historicoCorrida;

    public Motorista(String nomeCompleto, String telefone, String cpf, TipoContrato tipoContrato, Veiculo veiculo) {
        super(nomeCompleto, telefone, cpf);
        this.tipoContrato = tipoContrato;
        this.veiculo = veiculo;
        this.historicoCorrida = new ArrayList<>();
    }
    
    public Motorista(String nomeCompleto, String cpf, TipoContrato tipoContrato, Veiculo veiculo) {
        super(nomeCompleto, cpf);
        this.tipoContrato = tipoContrato;
        this.veiculo = veiculo;
        this.historicoCorrida = new ArrayList<>();
    }

    @Override
    public void cadastrar() {
        System.out.println("Motorista " + nomeCompleto + " cadastrado com sucesso!");
        System.out.println("Veículo: " + veiculo.getModelo() + " - " + veiculo.getPlaca());
    }

    public boolean aceitarCorrida(Corrida corrida) {
        if (corrida.getStatus() == StatusCorrida.SOLICITADA) {
            corrida.setStatus(StatusCorrida.ACEITA);
            corrida.setMotorista(this);
            historicoCorrida.add(corrida);
            return true;
        }
        return false;
    }

    public void finalizarCorrida(Corrida corrida) {
        if (historicoCorrida.contains(corrida)) {
            corrida.setStatus(StatusCorrida.FINALIZADA);
            historicoCorrida.remove(corrida);
            System.out.println("Corrida finalizada. Valor: R$" + corrida.calcularValor());
        }
    }

    // Getters
    public TipoContrato getTipoContrato() {
        return tipoContrato;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public List<Corrida> getHistoricoCorrida() {
        return new ArrayList<>(historicoCorrida);
    }
}
