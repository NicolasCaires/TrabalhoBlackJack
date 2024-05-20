package com.mycompany.trabalhodblackjack;

import java.util.ArrayList;
import java.util.Collections;

public abstract class Baralho {
    protected ArrayList<Carta> cartas;

    public Baralho() {
        cartas = new ArrayList<>();
        embaralhar();
    }

    public void embaralhar() {
        Collections.shuffle(cartas);
    }

    public Carta puxarCarta() {
        if (cartas.isEmpty()) {
            System.out.println("Não há mais cartas no baralho.");
            return null;
        }
        return cartas.remove(0);
    }
}

class BaralhoNormal extends Baralho {
    public BaralhoNormal() {
        super();
        String[] naipes = {"Copas", "Ouros", "Paus", "Espadas"};
        String[] valores = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Valete", "Dama", "Rei", "Ás"};
        int[] pontos = {2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11};

        for (String naipe : naipes) {
            for (int i = 0; i < valores.length; i++) {
                cartas.add(new CartaNormal(naipe, valores[i], pontos[i]));
            }
        }

        embaralhar();
    }
}
