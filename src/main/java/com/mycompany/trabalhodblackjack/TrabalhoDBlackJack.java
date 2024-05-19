/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhodblackjack;

/**
 *
 * @author nikcs
 */
import java.util.Scanner;

public class TrabalhoDBlackJack {
    private Baralho baralho;
    private Jogador jogador;
    private Jogador dealer;

    public TrabalhoDBlackJack() {
        baralho = new Baralho();
        jogador = new Jogador("Jogador");
        dealer = new Jogador("Dealer");
    }

    public void iniciar() {
        Scanner scanner = new Scanner(System.in);
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
            while (jogador.getPontuacao() < 21) {
                System.out.println("Você quer (1) Comprar ou (2) Parar?");
                int escolha = scanner.nextInt();
                if (escolha == 1) {
                    jogador.adicionarCarta(baralho.puxarCarta());
                    System.out.println(jogador);
                } else {
                    break;
                }
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
            } else if (dealer.getPontuacao() > jogador.getPontuacao()) {
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
