package CursoJava.aComplemento.Parte5.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;


public class Exercicio11 {
    /*
    crie uma lista de palavras e ordene em ordem alfabética. Imprima antes e depois

     */
    public static void main(String[] args){
        List<String> nomes = new ArrayList<>();

        nomes.add("Mareliza Machado dos Santos");
        nomes.add("Alfredo Dias");
        nomes.add("Bella Dias");
        nomes.add("Givanildo Ribeiro");

        Collections.sort(nomes);

        for(String m : nomes){
            System.out.println(m);
        }
    }
}
