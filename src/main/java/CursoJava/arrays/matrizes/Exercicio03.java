package CursoJava.arrays.matrizes;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args){
        /*
        Transpor matriz

        crie uma matriz 3x2 com valores inteiros fixos e imprima
        sua matriz transposta

        A transposta de uma matriz consiste em inverter suas linhas e
        colunas. Assim, uma matriz 3x2 se transforma em uma matriz 2x3
         */
        Scanner scan = new Scanner(System.in);


        int[] [] matrizA  =  {
                {1, 2},
                {2, 3},
                {3, 4}
        };

        int[][] matrizB = new int[matrizA[0].length][matrizA.length];

        for(int i = 0; i < matrizA.length; i++){
            for(int j = 0; j < matrizA[0].length; j++){
                matrizB[j][i] = matrizA[i][j];
            }
        }

        System.out.println("Matriz Transposta");
        for(int i = 0; i < matrizB.length; i++){
            for(int j = 0; j < matrizB[0].length; j++){
                System.out.print(matrizB[i][j] + " ");
            }
            System.out.println();
        }

    }
}
