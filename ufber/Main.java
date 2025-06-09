import Gerenciamento.Administrador;
import Sistema.Usuario.Cliente;
import Sistema.UFBER;

public class Main {
    public Main() {}
    
    public static void main(String args[]) {
        Administrador admin = new Administrador("admin", "0", "1");
        UFBER ufber = new UFBER();
        
        Cliente cliente = new Cliente("fulano", "123");
        boolean isIn = ufber.registrarCliente(cliente);
        
        if (isIn) {
            System.out.println("Cliente cadastrado com sucesso");
        }
    }
}