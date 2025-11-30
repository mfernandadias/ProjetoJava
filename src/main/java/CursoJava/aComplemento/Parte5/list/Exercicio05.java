package CursoJava.aComplemento.Parte5.list;

import java.util.ArrayList;
import java.util.List;

public class Exercicio05 {
    /*
    troque o elemento na posição 1 por outro valor e imrpima a lista
     */
    public static void main(String[] args){
        List<Integer> num = new ArrayList<>();

        num.add(9);
        num.add(10);
        num.add(12);
        num.add(13);
        num.add(14);
        num.add(9);
        num.add(15);

        num.set(1, 70);

        for(int n : num){
            System.out.println(n);
        }

    }
}
