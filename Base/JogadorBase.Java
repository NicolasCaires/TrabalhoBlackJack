
public abstract class Baralho {
    
    protected String[] nipes;
    protected String[] valores;
    protected ArrayList<Carta> cartas;
    
    /**
     * Gerar lista de cartas
     */
    public abstract void gerarBaralho();
    /**
     * usar método shuffle da classe Colections 
     */
    public abstract void embaralhar();
    /**
     * entrega uma carta do baralho para a mão do jogador
     * @return um objeto do tipo carta
     */
    public abstract Carta darCarta();
    /**
     * entrega uma lista de cartas para a mão do jogador
     * @return ArrayList de cartas
     */
    public abstract ArrayList<Carta> darCartas();
    /**
     * exibir baralho. para controle interno ( testes)
     */
    protected abstract void exibirBaralho();
    /**
     * método interno. verifica se baralho está vazio e gera novo 
     */
    protected abstract void verificarEPreencherBaralho();
}
