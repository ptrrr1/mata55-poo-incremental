package com.ufber.classes;

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

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getEnderecoCompleto() {
        return logradouro + ", " + numero + 
               (complemento != null ? " - " + complemento : "") + 
               " - " + bairro + 
               (referencia != null ? " (" + referencia + ")" : "");
    }

    // Getters
    public String getLogradouro() {
        return logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public String getReferencia() {
        return referencia;
    }
}