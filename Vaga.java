/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioestacionamento;

/**
 *
 * @author user
 */
public class Vaga {
    String posicao;
    boolean ocupado;
    Cliente cliente;
    
    public Vaga(String posicao, boolean ocupado)
    {
        this.posicao = posicao;
        this.ocupado = ocupado;
    }
    
    public void ocupar()
    {
        this.ocupado = true;
    }
    
    public void desocupar()
    {
        this.ocupado = false;
    }
}
