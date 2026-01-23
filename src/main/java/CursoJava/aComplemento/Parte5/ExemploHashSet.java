package CursoJava.aComplemento.Parte5;

import java.util.HashSet;

public class ExemploHashSet {
    public static void main(String[] args){
        /*
        HashSet
         */
        HashSet<String> nomes = new HashSet<>();
        nomes.add("Maria");
        nomes.add("João");
        nomes.add("Ana");
        nomes.add("Maria"); //duplicado, será ignorado

        
    }
}
