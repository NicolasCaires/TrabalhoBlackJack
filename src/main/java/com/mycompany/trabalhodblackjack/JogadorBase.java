/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhodblackjack;

import java.util.ArrayList;

/**
 *
 * @author nikcs
 */
// Classe abstrata para representar um jogador genérico
abstract class JogadorBase {
    protected String nome;
    protected ArrayList<Carta> mao;
    protected int pontuacao;

    public JogadorBase(String nome) {
        this.nome = nome;
        this.mao = new ArrayList<>();
        this.pontuacao = 0;
    }

    public void adicionarCarta(Carta carta) {
        mao.add(carta);
        pontuacao += carta.getPontos();
    }

    public void resetarMao() {
        mao.clear();
        pontuacao = 0;
    }

    public ArrayList<Carta> getMao() {
        return mao;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    @Override
    public String toString() {
        return nome + " com a mão " + mao.toString() + " e pontuação " + pontuacao;
    }

    public abstract boolean querPedirCarta();
}

// Classe concreta para representar o jogador do usuário
class Jogador extends JogadorBase {
    public Jogador(String nome) {
        super(nome);
    }

    @Override
    public boolean querPedirCarta() {
        // Implemente a lógica de decisão do jogador aqui
        return true;
    }
}

// Classe concreta para representar o jogador do dealer (computador)
class JogadorComputador extends JogadorBase {
    public JogadorComputador(String nome) {
        super(nome);
    }

    @Override
    public boolean querPedirCarta() {
        // Implemente a lógica de decisão do computador aqui
        return getPontuacao() < 17; // Dealer pede carta se o valor da mão for menor que 17
    }
}

