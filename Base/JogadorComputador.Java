
public abstract class Carta {
    
    protected String nipe;
    protected String valor;
    protected int pontuacao;
    

    public abstract String getNipe();    
    public abstract String getValor();
    public abstract int getPontuacao();
    public abstract void setPontuacao(int pontuacao);    
    public abstract void exibir();
    
    
}
