package CursoJava.aExercicios200.capitulo5Arrays;

public class Exercicio85 {
    /*
    Escreva um programa que leia uma matriz 3x3 e
    exiba a sua matriz transposta (inversão das linhas com as colunas)
     */
    public static void main(String[] args){

        int[][] valores = {
                {5, 7, 9},
                {9, 5, 7},
                {0, 10, 5}
        };

        for(int i = 0; i < valores.length; i++){
            for(int j = 0; j < valores.length; j++){
                System.out.print(valores[j][i] + " ");
            }
            System.out.println();
        }

    }
}
