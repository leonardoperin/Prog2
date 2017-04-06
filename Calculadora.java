/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import javax.swing.JFrame;

/**
 *
 * @author Perin
 */
public class Calculadora {

    float x;
    float y;
    float resultado;

    public Calculadora() {
        x = 0;
        y = 0;
        resultado = 0;
    }

    public void Soma() {
        resultado = x + y;
    }

    public void Subtracao() {
        resultado = x - y;
    }

    public void Multiplicacao() {
        resultado = x * y;
    }

    public void Divisao() {
        resultado = x / y;
    }

    public static void main(String[] args) {
        JFrame janela = new TelaCalculadora();
        janela.setVisible(true);
    }

}
