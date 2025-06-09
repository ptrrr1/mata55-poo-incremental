package Sistema.Corrida.Trajeto;

public class Trajeto {
    private Endereco origem;
    private Endereco destino;
    private double distancia; // em quilometros

    public Trajeto(Endereco origem, Endereco destino, double distancia) {
        this.origem = origem;
        this.destino = destino;
        this.distancia = distancia;
    }

    public double calcularTempoEstimado() {
        return 0.0; // TBD
    }
    
    public boolean equals(Trajeto t) {
        return this.origem.equals(t.getOrigem()) && 
                this.origem.equals(t.getOrigem()) && 
                this.distancia == t.getDistancia();
    }

    public Endereco getOrigem() {
        return origem;
    }
    
    public void setOrigem(Endereco origem) {
        this.origem = origem;
    }

    public Endereco getDestino() {
        return destino;
    }
    
    public void setDestino(Endereco destino) {
        this.destino = destino;
    }

    public double getDistancia() {
        return distancia;
    }
    
    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }
}