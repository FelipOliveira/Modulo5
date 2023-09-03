package utils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class OperacaoComArquivos {
    
    public static void EscreverArquivo(String nomeDoArquivo, String str) throws IOException{
    
    FileWriter fw = new FileWriter(nomeDoArquivo + ".txt");
 
    for (int i = 0; i < str.length(); i++)
        fw.write(str.charAt(i));
 
        System.out.println("Arquivo " + nomeDoArquivo + " escrito com sucesso!\n");
        fw.close();
    }

    public static void LerArquivo(String nomeDoArquivo) throws IOException{
        int ch;

        FileReader fr = null;
        try {
            fr = new FileReader(nomeDoArquivo + ".txt");
        }
        catch (FileNotFoundException fe) {
            System.out.println("Arquivo " + nomeDoArquivo + " não encontrado.");
        }
 
        while ((ch=fr.read())!=-1) System.out.print((char)ch);
 
        fr.close();
    }
}

