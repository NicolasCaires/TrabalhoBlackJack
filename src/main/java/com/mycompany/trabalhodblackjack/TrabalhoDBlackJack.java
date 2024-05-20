package com.mycompany.trabalhodblackjack;

import java.util.Scanner;

public class TrabalhoDBlackJack {
    private Baralho baralho;
    private Jogador jogador;
    private JogadorComputador dealer;
    private Scanner scanner;

    public TrabalhoDBlackJack() {
        baralho = new Baralho();
        scanner = new Scanner(System.in);
        jogador = new Jogador("Jogador", scanner);
        dealer = new JogadorComputador("Dealer");
    }

    public void iniciar() {
        System.out.println("Bem-vindo ao Blackjack!");

        boolean jogando = true;
        while (jogando) {
            jogador.resetarMao();
            dealer.resetarMao();
            baralho.embaralhar();

            jogador.adicionarCarta(baralho.puxarCarta());
            jogador.adicionarCarta(baralho.puxarCarta());
            dealer.adicionarCarta(baralho.puxarCarta());
            dealer.adicionarCarta(baralho.puxarCarta());

            System.out.println(jogador);
            System.out.println("Dealer mostra " + dealer.getMao().get(0));

            // Turno do jogador
            while (jogador.getPontuacao() < 21 && jogador.querPedirCarta()) {
                jogador.adicionarCarta(baralho.puxarCarta());
                System.out.println(jogador);
            }

            // Turno do dealer
            while (dealer.getPontuacao() < 17) {
                dealer.adicionarCarta(baralho.puxarCarta());
            }

            // Determinar o vencedor
            System.out.println(dealer);
            if (jogador.getPontuacao() > 21) {
                System.out.println("Jogador estourou! Dealer vence.");
            } else if (dealer.getPontuacao() > 21 || jogador.getPontuacao() > dealer.getPontuacao()) {
                System.out.println("Jogador vence!");
            } else if (dealer.getPontuacao()
