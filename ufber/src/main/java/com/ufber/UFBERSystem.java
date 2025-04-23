package com.ufber;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ufber.abstractions.Corrida;
import com.ufber.classes.CorridaCarona;
import com.ufber.classes.CorridaMercadoria;
import com.ufber.classes.Motorista;
import com.ufber.classes.Carro;
import com.ufber.classes.Cliente;
import com.ufber.classes.Moto;
import com.ufber.classes.Endereco;
import com.ufber.classes.Trajeto;
import com.ufber.enums.TipoContrato;

@SpringBootApplication
public class UFBERSystem {
    public static void main(String[] args) {
        // Could be removed later
        SpringApplication.run(UFBERSystem.class, args);

        // Create addresses for UFBA campuses
        Endereco federacao = new Endereco("Av. Reitor Miguel Calmon", "s/n", "Federação");
        Endereco ondina = new Endereco("Rua Barão de Jeremoabo", "s/n", "Ondina");
        Endereco canela = new Endereco("Rua Caetano Moura", "121", "Federação");
        Endereco minhaCasa = new Endereco("Rua Exemplo", "123", "Bairro Exemplo");
        minhaCasa.setComplemento("Apto 101");
        
        // Create routes
        Trajeto casaParaOndina = new Trajeto(minhaCasa, ondina, 8.5);
        Trajeto federacaoParaOndina = new Trajeto(federacao, ondina, 3.2);
        
        // Create clients
        Cliente cliente1 = new Cliente("João Silva", "71999998888", "12345678901");
        Cliente cliente2 = new Cliente("Maria Souza", "71999997777", "98765432109");
        
        // Create vehicles
        Carro carro1 = new Carro("ABC1234", "Preto", "Fiat Uno", 4);
        Moto moto1 = new Moto("XYZ9876", "Vermelha", "Honda CG 160", true);
        
        // Create drivers
        Motorista motorista1 = new Motorista("Carlos Oliveira", "71999996666", "45678912345", 
                                           TipoContrato.PRO_LABORE, carro1);
        Motorista motorista2 = new Motorista("Ana Santos", "71999995555", "78912345678", 
                                          TipoContrato.CARONA, moto1);
        
        // Register users
        cliente1.cadastrar();
        motorista1.cadastrar();
        motorista2.cadastrar();
        
        // Client requests rides
        Corrida corrida1 = cliente1.solicitarCorrida(casaParaOndina, TipoContrato.PRO_LABORE);
        Corrida corrida2 = cliente2.solicitarCorrida(federacaoParaOndina, TipoContrato.CARONA);
        
        // Driver accepts rides
        motorista1.aceitarCorrida(corrida1);
        motorista2.aceitarCorrida(corrida2);
        
        // Add another passenger to the carona
        ((CorridaCarona)corrida2).adicionarPassageiro(cliente1);
        
        // Finish rides
        motorista1.finalizarCorrida(corrida1);
        motorista2.finalizarCorrida(corrida2);
        
        // Request item delivery
        Corrida corrida3 = cliente1.solicitarCorrida(
            new Trajeto(minhaCasa, canela, 5.0), 
            TipoContrato.ENTREGA);
        
        // Set item details
        ((CorridaMercadoria)corrida3).getDescricaoItem(); // Would normally set this
        
        // Driver accepts and completes delivery
        motorista1.aceitarCorrida(corrida3);
        motorista1.finalizarCorrida(corrida3);
        
        // Print ride history
        System.out.println("\nHistórico de corridas de " + cliente1.getNomeCompleto() + ":");
        for (Corrida c : cliente1.getHistoricoCorridas()) {
            System.out.println("- " + c.getClass().getSimpleName() + " de " + 
                             c.getOrigem().getBairro() + " para " + 
                             c.getDestino().getBairro() + ": R$" + c.calcularValor());
        }
    }
}