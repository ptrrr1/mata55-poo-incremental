package Sistema;

import java.util.ArrayList;
import java.util.Iterator;

import Sistema.Corrida.Corrida;
import Sistema.Corrida.Trajeto.Trajeto;
import Sistema.Usuario.Motorista;
import Sistema.Usuario.Cliente;

public class UFBER {
    private ArrayList<Corrida> corridas = new ArrayList<Corrida>();
    private ArrayList<Trajeto> trajetos = new ArrayList<Trajeto>();
    private ArrayList<Motorista> motoristas = new ArrayList<Motorista>();
    private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    
    public UFBER() {}
    
    public ArrayList<Corrida> getHistoricoCorridas() {
        return new ArrayList<>(this.corridas);
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
}
