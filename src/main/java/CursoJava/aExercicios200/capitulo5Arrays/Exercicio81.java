package CursoJava.aExercicios200.capitulo5Arrays;

public class Exercicio81 {
    /*
    desenvolva um programa que leia uma matriz 3x3 de inteiros e calcule a soma de
    todos os elementos da matriz
     */
    public static void main(String[] args){
        int[][] valores = {
                {1, 2, 3},
                {8, 9, 0},
                {4, 5, 7}
        };
        int soma = 0;

        for(int i = 0; i < valores.length; i++){
            for(int j = 0; j < valores.length; j++){
                soma += valores[i][j];
            }
        }

        System.out.println(soma); 


    }
}
