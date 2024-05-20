/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhodblackjack;

/**
 *
 * @author nikcs
 */
public class Carta {
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

