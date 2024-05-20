package com.mycompany.trabalhodblackjack;

import java.util.Scanner;

public class TrabalhoDBlackJack {
    private Baralho baralho;
    private Jogador jogador;
    private Jogador dealer;
    private Scanner scanner;

    public TrabalhoDBlackJack() {
        baralho = new BaralhoNormal();
        scanner = new Scanner(System.in);
        jogador = new Player("Jogador", scanner);
        dealer = new Dealer("Dealer");
    }

    public void iniciar() {
        System.out.println("Bem-vindo ao Blackjack!");

        boolean jogando = true;
        while (jogando) {
            jogador.resetarMao();
            dealer.resetarMao();
            baralho.embaralhar();

            // Distribuir cartas iniciais
            jogador.comprarCartas(baralho.darCartas(2));
            dealer.comprarCartas(baralho.darCartas(2));

            System.out.println("--- Cartas do jogador ---");
            jogador.exibirMao();
            System.out.println("--- Cartas do dealer ---");
            dealer.exibirMao();

            // Turno do jogador
            while (jogador.querPedirCarta()) {
                Carta carta = baralho.darCarta();
                jogador.comprarCarta(carta);
                System.out.println("Você recebeu a carta: ");
                carta.exibir();
                System.out.println("--- Cartas do jogador ---");
                jogador.exibirMao();
                if (jogador.calcularPontuacao() >= 21) {
                    break;
                }
            }

            // Turno do dealer
            while (dealer.querPedirCarta()) {
                Carta carta = baralho.darCarta();
                dealer.comprarCarta(carta);
                System.out.println("O dealer recebeu a carta: ");
                carta.exibir();
                System.out.println("--- Cartas do dealer ---");
                dealer.exibirMao();
                if (dealer.calcularPontuacao() >= 21) {
                    break;
                }
            }

            // Determinar o vencedor
            int pontuacaoJogador = jogador.calcularPontuacao();
            int pontuacaoDealer = dealer.calcularPontuacao();

            if (pontuacaoJogador > 21) {
                System.out.println("Jogador estourou! Dealer vence.");
            } else if (pontuacaoDealer > 21 || pontuacaoJogador > pontuacaoDealer) {
                System.out.println("Jogador vence!");
            } else if (pontuacaoDealer > pontuacaoJogador) {
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
