package entity;

public class Jogador {
    private int pontosDeVida;
    private String nome;
    private Deck deck;

    public Jogador(int pontosDeVida, String nome, Deck deck){
        this.pontosDeVida = pontosDeVida;
        this.nome = nome;
        this.deck = deck;
    }
    
    public int getPontosDeVida() {
        return pontosDeVida;
    }
    public void setPontosDeVida(int pontosDeVida) {
        this.pontosDeVida = pontosDeVida;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Deck getDeck() {
        return deck;
    }
    public void setDeck(Deck deck) {
        this.deck = deck;
    }

    public String toString(){
        return  "\npontos de vida\t" + pontosDeVida +
                "\nnome\t" + nome +
                "\ndeck\t" + deck.getNome();
    }
}
