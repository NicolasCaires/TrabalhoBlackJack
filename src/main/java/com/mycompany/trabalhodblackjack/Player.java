import java.util.ArrayList;

public class Player {
    private String nome;
    private ArrayList<Carta> mao;
    private int pontuacao;

    public Player(String nome) {
        this.nome = nome;
        this.mao = new ArrayList<>();
        this.pontuacao = 0;
    }

    public void adicionarCarta(Carta carta) {
        mao.add(carta);
        pontuacao += carta.getPontos();
    }

    public void resetarMao() {
        mao.clear();
        pontuacao = 0;
    }

    public ArrayList<Carta> getMao() {
        return mao;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    @Override
    public String toString() {
        return nome + " com a mão " + mao.toString() + " e pontuação " + pontuacao;
    }

    public boolean querPedirCarta() {
        // Lógica para o jogador decidir se quer pedir carta ou não
    }
}
