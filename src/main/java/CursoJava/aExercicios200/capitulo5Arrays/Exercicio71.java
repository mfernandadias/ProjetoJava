package CursoJava.aExercicios200.capitulo5Arrays;

public class Exercicio71 {
    public static void main(String[] args){
        /*
        crie um programa que leia 6 números inteiros e armazene-os
        em um array
        Depois, exiba os valores do array na ordem inversa
         */
        int[] num = new int[6];
        num[0] = 0;
        num[1] = 8;
        num[2] = 1;
        num[3] = 1;
        num[4] = 6;
        num[5] = 2;

        for(int i = num.length- 1; i >= 0; i-- ){
            System.out.print(num[i] + " ");
        }

    }
}
