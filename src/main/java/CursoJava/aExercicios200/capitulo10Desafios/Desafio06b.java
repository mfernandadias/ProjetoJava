package CursoJava.aExercicios200.capitulo10Desafios;

import CursoJava.java10x.iniciante.parte8Arrays.Array;

import java.util.Arrays;

public class Desafio06b {
    /*

     */
    public static void main(String[] args){
        int[] num = {10, 29, 39, 0, 10, 2, 8, 9, 34};

        numero(num);

    }

    public static void numero(int[] num){
        Arrays.sort(num);
        System.out.println("Numeros em ordem crescente" + Arrays.toString(num));
    }
}
