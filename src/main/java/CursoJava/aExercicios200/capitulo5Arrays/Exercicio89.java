package CursoJava.aExercicios200.capitulo5Arrays;

public class Exercicio89 {
    /*
    crie um programa que leia uma matriz 5x5 e conte quantos números pares
    exitem na matriz
    Exiba o total de números pares encontrados
     */
    public static void main(String[] args){
        int[][] matrizA = {
                {3, 5, 6, 7},
                {0, 9, 1, 2},
                {3, 2, 3, 4,},
                {8, 9, 2, 3}
        };
        int pares = 0;


        for(int i = 0; i < matrizA.length; i++){
            for(int j = 0; j < matrizA.length; j++){
                if(matrizA[i][j] % 2 == 0){
                    pares++;
                }
            }
        }

        System.out.println(pares);
    }
}
