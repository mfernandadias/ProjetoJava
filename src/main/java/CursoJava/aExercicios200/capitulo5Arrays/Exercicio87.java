package CursoJava.aExercicios200.capitulo5Arrays;

public class Exercicio87 {
    public static void main(String[] args){
        /*
        desenvolva um programa que leia duas matrizes 2x2 e calcule o
        produto entre elas, exibindo o resultado
         */

        int[][] matriz1 = {
                {2, 4, 2},
                {9, 10, 19}
        };

        int[][] matriz2 = {
                {9, 10, 1},
                {19, 2, 1}
        };

        int [][] matriz3 = new int[2][2];

        for(int i = 0; i < matriz1.length; i++){
            for(int j = 0; i < matriz1.length; j++){
                matriz3[i][j] += (matriz1[i][j] * matriz2[i][j]);
            }
        }

    }
}
