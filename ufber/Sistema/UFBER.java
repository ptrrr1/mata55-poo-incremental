package Sistema;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import Sistema.Corrida.Corrida;
import Sistema.Corrida.Trajeto.Trajeto;
import Sistema.Usuario.Motorista;
import Sistema.Usuario.Cliente;
import Sistema.Enums.TipoContrato;

public class UFBER {
    /*
     * Metodos sao static pois esta eh a classe de gerenciamento do sistema.
     * Qualquer classe/metodo que utilize esta classe deve acessar as mesmas informacoes.
     * Esta classe nao foi transformada em um singleton, mas essa decisao foi considerada,
     * acredito que apenas ter variaveis do tipo static seja suficiente
     */
    
    private static ArrayList<Corrida> corridas = new ArrayList<Corrida>();
    private static ArrayList<Trajeto> trajetos = new ArrayList<Trajeto>();
    private static ArrayList<Motorista> motoristas = new ArrayList<Motorista>();
    private static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    
    public UFBER() {}
    
    public ArrayList<Corrida> getHistoricoCorridas() {
        return new ArrayList<>(this.corridas);
    }
    
    public ArrayList<Trajeto> getTrajetos() {
        return new ArrayList<>(this.trajetos);
    }
    
    public ArrayList<Motorista> getMotoristas() {
        return new ArrayList<>(this.motoristas);
    }
    
    public ArrayList<Cliente> getClientes() {
        return new ArrayList<>(this.clientes);
    }
    
    public boolean registrarCorrida(Corrida corrida) {
        boolean isIn = false;
        Iterator<Corrida> iter = this.corridas.iterator();
        while(iter.hasNext() && !isIn) {
            Corrida c = iter.next();
            if (corrida.equals(c)) {
                isIn = true;
            }
        }
        
        if (!isIn) {
            this.corridas.add(corrida);
        }
        
        return !isIn;
    }
    
    public boolean registrarTrajeto(Trajeto trajeto) {
        boolean isIn = false;
        Iterator<Trajeto> iter = this.trajetos.iterator();
        while(iter.hasNext() && !isIn) {
            Trajeto t = iter.next();
            if (trajetos.equals(t)) {
                isIn = true;
            }
        }
        
        if (!isIn) {
            this.trajetos.add(trajeto);
        }
        
        return !isIn;
    }
    
    public boolean registrarCliente(Cliente cliente) {
        boolean isIn = false;
        Iterator<Cliente> iter = this.clientes.iterator();
        while(iter.hasNext() && !isIn) {
            Cliente c = iter.next();
            if (cliente.equals(c)) {
                isIn = true;
            }
        }
        
        if (!isIn) {
            this.clientes.add(cliente);
        }
        
        return !isIn;
    }
    
    public boolean registrarMotorista(Motorista motorista) {
        boolean isIn = false;
        Iterator<Motorista> iter = this.motoristas.iterator();
        while(iter.hasNext() && !isIn) {
            Motorista m = iter.next();
            if (motorista.equals(m)) {
                isIn = true;
            }
        }
        
        if (!isIn) {
            this.motoristas.add(motorista);
        }
        
        return !isIn;
    }
    
    public ArrayList<Motorista> encontrarMotoristas(List<TipoContrato> contratos) {
        ArrayList<Motorista> motoristas_disp = new ArrayList<>();
        
        for (Motorista m : this.motoristas) {
            TipoContrato m_contrato = m.getTipoContrato();
            if (m.isAtivo() && contratos.contains(m_contrato)) {
                motoristas_disp.add(m);
            }
        }
        
        return motoristas_disp;
    }
    
    public ArrayList<Motorista> encontrarMotoristas(TipoContrato contrato) {
        return this.encontrarMotoristas(Collections.singletonList(contrato));
    }
}
