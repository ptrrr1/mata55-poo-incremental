package com.ufber.abstractions;

public abstract class Usuario {
    protected String nomeCompleto;
    protected String telefone;
    protected String cpf;
    
    public Usuario(String nomeCompleto, String telefone, String cpf) {
        this.nomeCompleto = nomeCompleto;
        this.telefone = telefone; // Add validation
        this.cpf = cpf; // Add validation
    }

    public abstract void cadastrar();

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getCpf() {
        return cpf;
    }
}
