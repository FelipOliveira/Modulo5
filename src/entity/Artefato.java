package entity;

import exception.MenorQueUmException;
import exception.NumeroNegativoException;
import utils.MyUtils;

public class Artefato extends Carta{
    private boolean equipamento;
    private String habilidade;
    private int poder;
    private int resistencia;
    private Cor cor = Cor.INCOLOR;

    public boolean isEquipamento() {
        return equipamento;
    }
    public void setEquipamento(boolean equipamento) {
        this.equipamento = equipamento;
    }
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
    public String getHabilidade() {
        return habilidade;
    }
    public void setHabilidade(String habilidade) {
        this.habilidade = habilidade;
    }
    public Cor getCor() {
        return cor;
    }

    @Override
    public String Virar(){
        if(equipamento) return "\nhabilidade " + habilidade + " utilizada";
        return "\n" + nome + " atacou, causando " + poder + " de dano";
    }

    @Override
    public String toString() {
        return  "\nnome\t" + nome +
                "\ncusto\t" + custo +
                "\nequipamento\t" + MyUtils.booleanToString(equipamento) + 
                "\nhabilidade\t" + habilidade;
    }
}
