package CursoJava.aExercicios200.capitulo5Arrays;

public class Exercicio88 {
    public static void main(String[] args){
        /*
        escreva um programa que leia duas matrizes 3x3 e calcule a soma entre elas,
        exibindo a matriz resultante
         */
        int[][] matrizA = {
                {3, 5, 6, 7},
                {0, 9, 1, 2},
                {3, 2, 3, 4,},
                {8, 9, 2, 3}
        };

        int[][] matrizB = {
                {1, 2, 4, 3},
                {9, 10, 2, 3},
                {3, 2, 3, 4,},
                {8, 9, 2, 3}
        };

        int[][] matrizC = new int[4][4];

        for(int i = 0; i < matrizA.length; i++){
            for(int j = 0; j < matrizB.length; j++){
                matrizC[i][j] += matrizA[i][j] + matrizB[i][j];
            }
        }

        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA.length; j++) {
                System.out.print(matrizC[i][j] + " ");
            }
            System.out.println();
        }

    }
}
