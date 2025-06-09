package Sistema.Usuario;

public abstract class Usuario {
    protected String nomeCompleto;
    protected String telefone;
    protected String cpf;
    protected boolean isAtivo = true; // Desatvado eh funcionalmente igual a apagado (por enquanto)
    
    public Usuario(String nomeCompleto, String telefone, String cpf) {
        this.nomeCompleto = nomeCompleto;
        this.telefone = telefone;
        this.cpf = cpf;
    }
    
    public Usuario(String nomeCompleto, String cpf) {
        this.nomeCompleto = nomeCompleto;
        this.telefone = null;
        this.cpf = cpf;
    }

    public abstract void cadastrar();

    public boolean isAtivo() {
        return this.isAtivo;
    }
    
    public void setStatusAtivo(boolean novoStatus) {
        this.isAtivo = novoStatus;
    }
    
    public String getNomeCompleto() {
        return nomeCompleto;
    }
    
    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getTelefone() {
        return telefone;
    }
    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }
    
    public boolean equals(Usuario u) {
        return this.cpf == u.getCpf();
    }
}
