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
        int escolha = scanner.nextInt();
        return escolha == 1;
    }
}
