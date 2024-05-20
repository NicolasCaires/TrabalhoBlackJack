package com.mycompany.trabalhodblackjack;

public abstract class Carta {
    private String naipe;
    private String valor;
    private int pontos;

    public Carta(String naipe, String valor, int pontos) {
        this.naipe = naipe;
        this.valor = valor;
        this.pontos = pontos;
    }

    public String getNaipe() {
        return naipe;
    }

    public String getValor() {
        return valor;
    }

    public int getPontos() {
        return pontos;
    }

    @Override
    public String toString() {
        return valor + " de " + naipe;
    }
}

class CartaNormal extends Carta {
    public CartaNormal(String naipe, String valor, int pontos) {
        super(naipe, valor, pontos);
    }
}
