import java.util.Scanner;

public class Dealer extends Jogador {

    public Dealer(String nome) {
        super();
        this.nome = nome;
    }

    @Override
    public void exibirMao() {
        System.out.println("Mão do dealer:");
        System.out.println(maoJogador.get(0)); // Mostra apenas a primeira carta
        System.out.println("Carta oculta"); // A segunda carta do dealer é oculta
    }

    public boolean querPedirCarta() {
        // Regra do dealer: pedir carta até atingir 17 pontos ou mais
        int pontuacao = calcularPontuacao();
        return pontuacao < 17;
    }
}
