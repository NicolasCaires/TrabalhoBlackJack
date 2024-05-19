/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhodblackjack;

/**
 *
 * @author nikcs
 */
import java.util.ArrayList;
package com.mycompany.trabalhodblackjack;

import java.util.Scanner;

public class Jogador extends JogadorBase {
    private Scanner scanner;

    public Jogador(String nome, Scanner scanner) {
        super(nome);
        this.scanner = scanner;
    }

    @Override
    public boolean querPedirCarta() {
        System.out.println("Você quer (1) Comprar ou (2) Parar?");
        int escolha = -1;
        while (escolha != 1 && escolha != 2) {
            try {
                escolha = Integer.parseInt(scanner.nextLine());
                if (escolha != 1 && escolha != 2) {
                    System.out.println("Escolha inválida. Digite (1) para Comprar ou (2) para Parar.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, digite um número.");
            }
        }
        return escolha == 1;
    }
}

public class Jogador {
    private String nome;
    private ArrayList<Carta> mao;
    private int pontuacao;

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
}
