package CursoJava.aComplemento.Parte5;

import java.util.TreeSet;

public class ExemploTreeSet {
    public static void main(String[] args){
        /*
        Também implementa Set
        Mantém os elementos ordendos (ordem natural ou via Comparator)
        Baseado em árvore rubro-negra
         */
        TreeSet<String> nomes = new TreeSet<>();
        nomes.add("Maria");
        nomes.add("Fernanda");
        nomes.add("Maria");
        nomes.add("Mareliza");

        System.out.println(nomes); //ordenado alfabeticamente: [Ana, João, Maria]

    }
}
