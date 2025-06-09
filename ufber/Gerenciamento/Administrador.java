package Gerenciamento;

import Sistema.Usuario.Usuario;
import Sistema.Corrida.Trajeto.Trajeto;
import Sistema.Corrida.Trajeto.Endereco;

public class Administrador extends Usuario
{
    private String matricula;
    
    public Administrador(String nomeCompleto, String cpf, String matricula) {
        super(nomeCompleto, null, cpf);
        this.matricula = matricula;
    }
    
    @Override
    public void cadastrar() {
        System.out.println("Administrador " + nomeCompleto + " cadastrado com sucesso!");
    }
    
    public Trajeto criarTrajeto(Endereco origem, Endereco destino, double distancia) {
        return new Trajeto(origem, destino, distancia);
    }
    
    public Trajeto editarTrajetoOrigem(Trajeto trajeto, Endereco origem) {
        trajeto.setOrigem(origem);
        return trajeto;
    }
    
    public Trajeto editarTrajetoDestino(Trajeto trajeto, Endereco destino) {
        trajeto.setDestino(destino);
        return trajeto;
    }
    
    public Trajeto editarTrajetoDistancia(Trajeto trajeto, double distancia) {
        trajeto.setDistancia(distancia);
        return trajeto;
    }
    
    public boolean removerTrajeto(Trajeto trajeto) {
        return false; // TBD
    }
    
    public void bloquearUsuario(Usuario u) {
        u.setStatusAtivo(false);
    }
    
    public void desbloquearUsuario(Usuario u) {
        u.setStatusAtivo(true);
    }
    
    public void apagarUsuario(Usuario u) {
        u.setStatusAtivo(false); // Mesmo comportamento de bloquear, mas precisa ser removido da lista
    }
    
    public Usuario editarUsuario(Usuario u, String novoNome, String novoTelefone) {
        if (novoNome != null) {
            u.setNomeCompleto(novoNome);
        }
        
        if (novoTelefone != null) {
            u.setTelefone(novoTelefone);
        }
        
        return u;
    }
}
