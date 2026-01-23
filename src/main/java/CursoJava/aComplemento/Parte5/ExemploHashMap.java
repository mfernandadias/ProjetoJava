package CursoJava.aComplemento.Parte5;

import java.util.HashMap;

public class ExemploHashMap {
    public static void main(String[] args){
        /*
        HashMap
        Implementa Map
        Armazena pares chave-valor
        Chaves únicas
        Não garante ordem
         */
        HashMap<Integer, String> mapa = new HashMap<>();

        mapa.put(1, "Maria");
        mapa.put(2, "João");
        mapa.put(3, "Ana");

        System.out.println(mapa.get(2)); // João

    }
}
