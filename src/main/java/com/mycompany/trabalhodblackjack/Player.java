import java.util.Scanner;

public class Player extends Jogador {
    
    private Scanner scanner;

    public Player(String nome, Scanner scanner) {
        super();
        this.nome = nome;
        this.scanner = scanner;
    }

    @Override
    public void exibirMao() {
        System.out.println("Mão do jogador " + nome + ":");
        for (Carta carta : maoJogador) {
            carta.exibir();
        }
    }

    public boolean querPedirCarta() {
        System.out.println("Deseja pedir mais uma carta? (s/n)");
        String resposta = scanner.next();
        return resposta.equalsIgnoreCase("s");
    }
}
