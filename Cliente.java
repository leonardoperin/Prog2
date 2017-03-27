/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioestacionamento;

import java.util.Date;
/**
 *
 * @author user
 */
public class Cliente {
    String placa;
    Date chegada;
    Vaga vaga;
    
    public Cliente(String placa, Date chegada)
    {
        this.placa = placa;
        this.chegada = chegada;
    }
    
}