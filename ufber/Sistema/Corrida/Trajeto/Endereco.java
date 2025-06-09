package Sistema.Corrida.Trajeto;

public class Endereco {
    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String referencia;

    public Endereco(String logradouro, String numero, String bairro) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
    }

    public String getEnderecoCompleto() {
        return logradouro + ", " + numero + 
               (complemento != null ? " - " + complemento : "") + 
               " - " + bairro + 
               (referencia != null ? " (" + referencia + ")" : "");
    }
    
    public String toString() {
        return this.getEnderecoCompleto();
    }
    
    public boolean equals(Endereco e) {
        return this.getEnderecoCompleto().equals(e.getEnderecoCompleto());
    }
    
    // Getters
    public String getLogradouro() {
        return logradouro;
    }
    
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }
    
    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }
    
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }
    
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getReferencia() {
        return referencia;
    }
    
    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }
}
