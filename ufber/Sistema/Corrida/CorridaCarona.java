package Sistema.Corrida;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;

import Sistema.UFBER;
import Sistema.Corrida.Trajeto.Trajeto;
import Sistema.Usuario.Cliente;
import Sistema.Usuario.Motorista;
import Sistema.Enums.TipoContrato;

public class CorridaCarona extends Corrida {
    private List<Cliente> passageiros;

    public CorridaCarona(Trajeto trajeto, Cliente cliente) {
        super(trajeto, cliente);
        this.passageiros = new ArrayList<>();
        this.passageiros.add(cliente);
    }
    
    public CorridaCarona(Trajeto trajeto, Cliente cliente, LocalDateTime hora) {
        super(trajeto, cliente, hora);
        this.passageiros = new ArrayList<>();
        this.passageiros.add(cliente);
    }
    
    protected ArrayList<Motorista> verificarMotoristas() {
        UFBER u = new UFBER();
        return u.encontrarMotoristas(TipoContrato.CARONA);
    }

    public void adicionarPassageiro(Cliente passageiro) {
        passageiros.add(passageiro);
    }

    public double calcularValor() {
        return 0.0;
    }

    public List<Cliente> getPassageiros() {
        return new ArrayList<>(passageiros);
    }
}
