/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioestacionamento;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author user
 */
public class Estacionamento {
    ArrayList<Vaga> vagas;
    
    public Estacionamento(int n_vagas)
    {
        vagas = new ArrayList();
        
        for (int i = 1; i <= n_vagas; ++i)
        {
            vagas.add(new Vaga("E"+i, false));
            vagas.add(new Vaga("D"+i, false));
        }
    }
    
    public boolean recebeCliente(Cliente cliente)
    {
        for (Vaga vaga: this.vagas)
        {
            if (vaga.ocupado == false)
            {
                vaga.ocupar();
                vaga.cliente = cliente;
                cliente.vaga = vaga;
                return true;
            }
        }
        
        return false;
    }
    
    double liberaCliente(Cliente cliente)
    {
        double segundos, minutos, horas;
        long inicio, fim;
        Date saida = new Date();
        cliente.vaga.desocupar();
        
        inicio = cliente.chegada.getTime();
        fim    = saida.getTime();
        
        segundos = (fim-inicio)/1000.0;
        minutos  = segundos/60;
        horas    = minutos/60;
        
        if (horas <= 1)
            return horas * 4.0;
        else
            return ((horas-1)*2.0) + 4.0;
    }
}