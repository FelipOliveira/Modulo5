import java.io.IOException;
import java.util.List;

import entity.Artefato;
import entity.Carta;
import entity.Cor;
import entity.Criatura;
import entity.Deck;
import entity.Jogador;
import entity.Terreno;
import utils.OperacaoComArquivos;

public class App {
    public static void main(String[] args) throws Exception, IOException {
        Terreno terreno1 = new Terreno();
        terreno1.setId(1);
        terreno1.setNome("ilha");
        terreno1.setQuantidadeMana(1);
        terreno1.setCor(Cor.AZUL);

        Terreno terreno2 = new Terreno();
        terreno2.setId(2);
        terreno2.setNome("montanha");
        terreno2.setCor(Cor.VERMELHO);
        terreno2.setQuantidadeMana(1);

        Terreno terreno3 = new Terreno();
        terreno3.setId(3);
        terreno3.setNome("floresta");
        terreno3.setCor(Cor.VERDE);
        terreno3.setQuantidadeMana(1);

        Criatura criatura1 = new Criatura();
        criatura1.setId(4);
        criatura1.setNome("salamandra");
        criatura1.setCor(Cor.VERMELHO);
        criatura1.setCusto(1);
        criatura1.setPoder(1);
        criatura1.setResistencia(2);
        
        Criatura criatura2 = new Criatura();
        criatura2.setId(5);
        criatura2.setNome("urso");
        criatura2.setCor(Cor.VERDE);
        criatura2.setCusto(4);
        criatura2.setPoder(3);
        criatura2.setResistencia(3);

        Criatura criatura3 = new Criatura();
        criatura3.setId(6);
        criatura3.setNome("tigre");
        criatura3.setCor(Cor.VERMELHO);
        criatura3.setCusto(2);
        criatura3.setPoder(2);
        criatura3.setResistencia(1);

        Artefato artefato1 = new Artefato();
        artefato1.setId(7);
        artefato1.setNome("armadura");
        artefato1.setCusto(2);
        artefato1.setEquipamento(true);
        artefato1.setHabilidade("+0/+1");
    
        Artefato artefato2 = new Artefato();
        artefato2.setId(8);
        artefato2.setNome("lança");
        artefato2.setCusto(2);
        artefato2.setEquipamento(true);
        artefato2.setHabilidade("+1/+0, iniciativa");

        Artefato artefato3 = new Artefato();
        artefato3.setId(9);
        artefato3.setNome("robô");
        artefato3.setCusto(3);
        artefato3.setEquipamento(false);
        artefato3.setPoder(3);
        artefato3.setResistencia(2);

        List<Carta> cartas1 = List.of(
            terreno1,
            terreno2,
            terreno3,
            criatura1,
            criatura2,
            criatura3,
            artefato1,
            artefato2,
            artefato3
        );

        List<Carta> cartas2 = List.of(
            terreno1,
            terreno2,
            terreno3,
            criatura1,
            criatura2,
            criatura3
        );

        List<Carta> cartas3 = List.of(
            terreno1,
            terreno2,
            terreno3,
            artefato1,
            artefato2,
            artefato3
        );

        Deck deck1 = new Deck();
        deck1.setNome("deck do joãozinho");
        deck1.setCartas(cartas1);

        Deck deck2 = new Deck();
        deck2.setNome("deck do fulaninho");
        deck2.setCartas(cartas2);

        Deck deck3 = new Deck();
        deck3.setNome("deck do ciclaninho");
        deck3.setCartas(cartas3);
        
        Jogador jogador1 = new Jogador(20, "joãozinho", deck1);
        Jogador jogador2 = new Jogador(20, "fulaninho", deck2);
        Jogador jogador3 = new Jogador(20, "ciclaninho", deck3);
        
        OperacaoComArquivos.EscreverArquivo(jogador1.getNome(),jogador1.getDeck().getCartas().toString());
        OperacaoComArquivos.EscreverArquivo(jogador2.getNome(),jogador2.getDeck().getCartas().toString());
        OperacaoComArquivos.EscreverArquivo(jogador3.getNome(),jogador3.getDeck().getCartas().toString());

        OperacaoComArquivos.LerArquivo(jogador1.getNome());
    }
}
