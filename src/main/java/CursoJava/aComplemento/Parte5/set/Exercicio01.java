package CursoJava.aComplemento.Parte5.set;

import java.util.HashSet;

public class Exercicio01 {
    public static void main(String[] args){
        HashSet<String> nomes = new HashSet<>();
         nomes.add("Maria");
         nomes.add("Jair");
         nomes.add("Fernanda");
         nomes.add("Alfredo");
         nomes.add("Jair");
         //não aceita o mesmo valor duplicado

        for(String n : nomes){
            System.out.println(n);
        }

        System.out.println("------");


        nomes.remove("Jair");

        for(String n : nomes){
            System.out.println(n);
        }


    }
}
