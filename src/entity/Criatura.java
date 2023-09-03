package entity;

import exception.MenorQueUmException;
import exception.NumeroNegativoException;

public class Criatura extends Carta{
    private int poder;
    private int resistencia;
    private String flavorText;
    private Cor cor;
    
    public int getPoder() {
        return poder;
    }
    public void setPoder(int poder) throws NumeroNegativoException{
        if(poder < 0) throw new NumeroNegativoException();

        this.poder = poder;
    }
    public int getResistencia() {
        return resistencia;
    }
    public void setResistencia(int resistencia) throws MenorQueUmException{
        if(resistencia < 1) throw new MenorQueUmException();

        this.resistencia = resistencia;
    }
    public String getFlavorText() {
        return flavorText;
    }
    public void setFlavorText(String flavorText) {
        this.flavorText = flavorText;
    }
    public Cor getCor() {
        return cor;
    }
    public void setCor(Cor cor) {
        this.cor = cor;
    }

    @Override
    public String Virar(){
        return "\n" + nome + " atacou, causando " + poder + " de dano";
    }

    @Override
    public String toString() {
        return  "\nnome\t" + nome +
                "\ncor\t" + cor +
                "\ncusto\t" + custo + 
                "\npoder\t" + poder +
                "\nresistência\t" + resistencia + 
                "\ntexto\t" + flavorText;
    }
}
