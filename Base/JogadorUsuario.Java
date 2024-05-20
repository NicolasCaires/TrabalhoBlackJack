
public abstract class Jogador {
    
    protected ArrayList<Carta> maoJogador;
    protected int numCartas;
    
    /**
     * Adiciona uma carta do baralho para a mão
     * @param carta carta comprada do baralho
     */
    public abstract void comprarCarta(Carta carta);
    /**
     * Adiciona uma lista de cartas 
     * @param cartas arraylist de cartas
     */
    public abstract void comprarCartas(ArrayList<Carta> cartas);
    /**
     * exibe lista de cartas
     * se for o dealer não exibe a primeira carta até o fim da jogada do player
     * se for o player exibe normalmente
     * cartas devem ser exibidas em ordem (implementar Comparable em Carta e usar Collections.sort)
     */
    protected abstract void exibirMao();
    
}
