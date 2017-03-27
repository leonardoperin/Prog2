/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioestacionamento;

import static java.lang.Thread.sleep;
import java.util.Date;
/**
 *
 * @author user
 */
public class ExercicioEstacionamento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        Estacionamento estacionamento = new Estacionamento(12);
        Cliente cliente = new Cliente("ABC321", new Date());
        double preco;
        
        System.out.println("Recebendo cliente");
        estacionamento.recebeCliente(cliente);
        
        sleep(2500);
        
        System.out.println("Liberando cliente");
        preco = estacionamento.liberaCliente(cliente);
        
        System.out.println("Cliente("+cliente.placa+") : "+preco+"R$");
    }
}
