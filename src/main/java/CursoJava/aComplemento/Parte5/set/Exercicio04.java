package CursoJava.aComplemento.Parte5.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Exercicio04 {
    public static void main(String[] args){
        /*
        para definir esta vaz isEmpty(), que true se false c
         */

        Set<String> nomes = new HashSet<>();

        //limpando todos conteudos da lista
        nomes.clear();

        //verificando se está vazia
        if(nomes.isEmpty()){
            System.out.println("O conjunto está vazio");
        }else {
            System.out.println("O conjunto contém elementos");
        }




    }
}
