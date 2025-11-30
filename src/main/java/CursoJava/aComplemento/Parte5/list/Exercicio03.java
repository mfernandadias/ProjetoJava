package CursoJava.aComplemento.Parte5.list;


import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class Exercicio03 {
    /*
    Remover por valor e por índice
    Crie uma lista com (1,2,3, 4,5}. Remova o elemento 3(valor) e depois remova
    o elemento do índice 0.
     */

    public static void  valor(List<Integer> valor){
        valor.remove(Integer.valueOf(3));
        System.out.println("Elemanação do elemento 3: " + valor  );

        valor.remove(0);
        System.out.println("Eliminação do índice 0: " + valor);
    }
    public static void main(String[] args){
        List<Integer> valor = new ArrayList<>();

        valor.add(0);
        valor.add(10);
        valor.add(9);
        valor.add(90);
        valor.add(9);
        valor.add(15);
        valor.add(19);
        valor.add(8);

        valor(valor);


        
    }
}
