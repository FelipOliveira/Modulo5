package entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import exception.ListaVaziaException;

public class Deck {
    private String nome;
    private List<Carta> cartas = new ArrayList<>();

    public String getNome() {
        return nome;
    }
    public void setCartas(List<Carta> cartas) throws ListaVaziaException{
        if(cartas.isEmpty()) throw new ListaVaziaException();
        this.cartas = cartas;
    }
    public void addCarta(Carta carta){
        cartas.add(carta);
    }
    public List<Carta> getCartas() {
        return cartas;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String toString(){
        return Arrays.toString(cartas.toArray());
    }
}
