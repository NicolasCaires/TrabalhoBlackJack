// Jogador.java
package com.mycompany.trabalhodblackjack;

import java.util.Scanner;

public class Jogador extends JogadorBase {
    public Jogador(String nome) {
        super(nome);
    }

    @Override
    public boolean querPedirCarta() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Você quer (1) Comprar ou (2) Parar?");
        int escolha = scanner.nextInt();
        scanner.close();
        return escolha == 1;
    }
}
