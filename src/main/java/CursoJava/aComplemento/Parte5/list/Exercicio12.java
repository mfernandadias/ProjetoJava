package CursoJava.aComplemento.Parte5.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercicio12 {
    public static void main(String[] args){
        /*
        ordenar inteiros decrescente
        Ordene uma lista de Interfer em ordem decrescente
        Hint: Collections.sort(list, Collections.reverseOrder())
        ou list.sort(Comparator.reverseOrder()).

         Esse exercício é para pratica ordenação de listas de números(List<Integer>),
         mas agora em ordem decrescente( do maior para o menor)
         */
        List<Integer> num = new ArrayList<>();

        num.add(9);
        num.add(10);
        num.add(5);
        num.add(19);
        num.add(0);
        num.add(19);
        num.add(18);

        //forma 1 - usando Collections.sort()
        Collections.sort(num, Collections.reverseOrder());
        System.out.println("Ordenada (decrescente) com Collections.sort: " + num );

        //forma - usando list.sort()
        num = new ArrayList<>();



    }
}
