package com.mycompany.trabalhodblackjack;

import java.util.Scanner;

public class JogadorUsuario extends JogadorBase {
    private Scanner scanner;

    public JogadorUsuario(String nome, Scanner scanner) {
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
