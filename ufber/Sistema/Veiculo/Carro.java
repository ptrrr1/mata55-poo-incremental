package Sistema.Veiculo;

public class Carro extends Veiculo {
    private int capacidadePassageiros;

    public Carro(String placa, String cor, String modelo, int capacidadePassageiros) {
        super(placa, cor, modelo);
        this.capacidadePassageiros = capacidadePassageiros;
    }

    @Override
    public String getTipo() {
        return "Carro";
    }

    public int getCapacidadePassageiros() {
        return capacidadePassageiros;
    }
}
