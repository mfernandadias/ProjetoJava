package CursoJava.aComplemento.Parte5.list;

import java.util.ArrayList;
import java.util.List;

public class Exercicio06 {
    /*
    converta um List<String> em String[] e imprima os
    elementos do array
     */
    public static void main(String[] args){
        List<String> nomes = new ArrayList<>();

        nomes.add("Fernanda");
        nomes.add("Mareliza");
        nomes.add("Alfredo");

        //converter a lista para um array de String
        String[] arrayNomes = nomes.toArray(new String[0]);

        //imrprimir os elementos do array
        System.out.println("Elementos do array");
        for(String nome : arrayNomes){
            System.out.println(nome);
        }

    }
}
