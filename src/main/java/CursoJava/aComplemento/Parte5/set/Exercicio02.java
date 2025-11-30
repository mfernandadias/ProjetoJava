package CursoJava.aComplemento.Parte5.set;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Exercicio02 {
    public static void main(String[] args){
        TreeSet<Integer> valores = new TreeSet<>();

        valores.add(90);
        valores.add(10);
        valores.add(9);
        valores.add(10);
        valores.add(0);
        valores.add(22);

        //imprimindo em ordem crescente
        System.out.println("Números em ordem crescente: ");
        for(Integer i : valores){
            System.out.println(i);
        }

        System.out.println("==========");

        System.out.println(valores.getFirst());
        System.out.println(valores.getLast());

        valores.clear();

        valores.clone();

    }
}
