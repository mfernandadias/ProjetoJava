package CursoJava.aComplemento.Parte5.list;

import java.util.ArrayList;
import java.util.List;

public class Exercicio01 {
    public static void vetor(List<String> nomes){

        for(String n : nomes){
            System.out.println(n);
        }
    }


    //remover elemento pelo
    public static String remocao(int i, List<String> nomes){
            return nomes.remove(i);
    }

    public static void main(String[] args){
        List<String> nomes = new ArrayList<>();

        nomes.add("Maria");
        nomes.add("Fernanda");
        nomes.add("Jair");
        nomes.add("Jair");

        vetor(nomes);

        System.out.println("Tamanho: " + nomes.size()) ;

        nomes.remove("Fernanda");

        System.out.println(nomes.contains("Maria"));

        vetor(nomes);

        nomes.add(0, "Mareliza");

        System.out.println("==============");
        vetor(nomes);

        System.out.println("==============");
        for(int i = nomes.size() - 1; i >= 0; i--){
            System.out.println(nomes.get(i));
        }

    }
}
