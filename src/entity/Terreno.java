package entity;

import exception.IncolorException;
import exception.MenorQueUmException;

public class Terreno extends Carta{
    private Cor cor;
    private int quantidadeMana;

    public int getQuantidadeMana() {
        return quantidadeMana;
    }
    public void setQuantidadeMana(int quantidadeMana) throws MenorQueUmException{
        if(quantidadeMana < 1) throw new MenorQueUmException();
        
        this.quantidadeMana = quantidadeMana;
    }
    public Cor getCor() {
        return cor;
    }
    public void setCor(Cor cor) throws IncolorException{
        if(cor == Cor.INCOLOR || cor == null) throw new IncolorException();
        
        this.cor = cor;
    }

    @Override
    public String Virar(){
        return "\nvocê gerou " + quantidadeMana + " de mana " + cor + "\n";
    }

    @Override
    public String toString() {
        return  "\nnome\t" + nome +
                "\ncor\t" + cor +
                "\nmana gerado\t" + quantidadeMana;
    }
    
}
