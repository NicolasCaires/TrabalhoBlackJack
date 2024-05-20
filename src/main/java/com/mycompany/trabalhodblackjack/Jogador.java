package com.mycompany.trabalhodblackjack;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Jogador {
    protected String nome;
    protected ArrayList<Carta> mao;
    protected int pontuacao;

    public Jogador(String nome) {
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

class Dealer extends Jogador {
    public Dealer(String nome) {
        super(nome);
    }

    @Override
    public boolean querPedirCarta() {
        return getPontuacao() < 17;
    }
}

class Player extends Dealer {
    private Scanner scanner;

    public Player(String nome, Scanner scanner) {
        super(nome);
        this.scanner = scanner;
    }

    @Override
    public boolean querPedirCarta() {
        System.out.println("Você quer (1) Comprar ou (2) Parar?");
        int escolha = scanner.nextInt();
        return escolha == 1;
    }
}
