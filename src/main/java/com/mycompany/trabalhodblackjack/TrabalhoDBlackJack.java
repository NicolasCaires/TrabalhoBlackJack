// TrabalhoDBlackJack.java
package com.mycompany.trabalhodblackjack;

import java.util.Scanner;

public class TrabalhoDBlackJack {
    private Baralho baralho;
    private JogadorBase jogador;
    private JogadorBase dealer;

    public TrabalhoDBlackJack() {
        baralho = new Baralho();
        jogador = new Jogador("Jogador");
        dealer = new JogadorComputador("Dealer");
    }

    public void iniciar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem-vindo ao Blackjack!");

        boolean jogando = true;
        while (jogando) {
            ((JogadorBase) jogador).resetarMao();
            ((JogadorBase) dealer).resetarMao();
            baralho.embaralhar();

            ((JogadorBase) jogador).adicionarCarta(baralho.puxarCarta());
            ((JogadorBase) jogador).adicionarCarta(baralho.puxarCarta());
            ((JogadorBase) dealer).adicionarCarta(baralho.puxarCarta());
            ((JogadorBase) dealer).adicionarCarta(baralho.puxarCarta());

            System.out.println(jogador);
            System.out.println("Dealer mostra " + ((JogadorBase) dealer).getMao().get(0));

            // Turno do jogador
            while (((JogadorBase) jogador).getPontuacao() < 21 && ((JogadorBase) jogador).querPedirCarta()) {
                ((JogadorBase) jogador).adicionarCarta(baralho.puxarCarta());
                System.out.println(jogador);
            }

            // Turno do dealer
            while (((JogadorBase) dealer).getPontuacao() < 17) {
                ((JogadorBase) dealer).adicionarCarta(baralho.puxarCarta());
            }

            // Determinar o vencedor
            System.out.println(dealer);
            if (((JogadorBase) jogador).getPontuacao() > 21) {
                System.out.println("Jogador estourou! Dealer vence.");
            } else if (((JogadorBase) dealer).getPontuacao() > 21 || ((JogadorBase) jogador).getPontuacao() > ((JogadorBase) dealer).getPontuacao()) {
                System.out.println("Jogador vence!");
            } else if (((JogadorBase) dealer).getPontuacao() > ((JogadorBase) jogador).getPontuacao()) {
                System.out.println("Dealer vence!");
            } else {
                System.out.println("Empate!");
            }

            System.out.println("Você quer jogar novamente? (1) Sim (2) Não");
            int jogarNovamente = scanner.nextInt();
            if (jogarNovamente != 1) {
                jogando = false;
            }
        }

        System.out.println("Obrigado por jogar!");
        scanner.close();
    }

    public static void main(String[] args) {
        TrabalhoDBlackJack jogo = new TrabalhoDBlackJack();
        jogo.iniciar();
    }
}
