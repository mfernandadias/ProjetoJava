package CursoJava.aComplemento.Parte5;

import java.util.LinkedHashMap;

public class ExemploLinkedHashMap {
    /*
    mesma funcionalidade do HashMao
    Mantém a ordem de inserção
     */
    public static void main(String[] args){
        LinkedHashMap<Integer, String> mapa = new LinkedHashMap<>();

        mapa.put(1, "Maria");
        mapa.put(2, "João");
        mapa.put(3, "Ana");

        System.out.println(mapa); // Ordem de inserção: {1=Maria, 2=João, 3=Ana}
    }
}
