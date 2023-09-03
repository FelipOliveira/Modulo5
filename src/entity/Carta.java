package entity;

public abstract class Carta {
    protected int id;
    protected String nome;
    protected int custo;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getCusto() {
        return custo;
    }
    public void setCusto(int custo) {
        this.custo = custo;
    }

    public abstract String Virar();
    
    public abstract String toString();
}