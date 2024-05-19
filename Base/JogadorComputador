// JogadorComputador.java
package com.mycompany.trabalhodblackjack;

public class JogadorComputador extends JogadorBase {
    public JogadorComputador(String nome) {
        super(nome);
    }

    @Override
    public boolean querPedirCarta() {
        return getPontuacao() < 17; // Dealer pede carta se o valor da mão for menor que 17
    }
}
