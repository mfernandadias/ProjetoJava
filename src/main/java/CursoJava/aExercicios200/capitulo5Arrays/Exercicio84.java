package CursoJava.aExercicios200.capitulo5Arrays;

public class Exercicio84 {
    /*
    desenvolva um programa que permite ao usuário preencher uma matriz 4x4
    com valores inteiros. O programa deve pedir ao usuário para buscar na matriz e
    informar em qual posição ele foi encontrado(linha e coluna)
     */
    public static void main(String[] args){
        int[][] valores = {
                {2, 4, 5},
                {6, 7, 8},
                {6, 8, 9}
        };

        int valor = 9;

        for(int i = 0; i < valores.length; i++){
            for(int j = 0; j < valores.length; j++){
                if(valores[i][j] == valor){
                    System.out.println("Linha " + i);
                    System.out.println("Coluna " + j);
                }
            }
        }
    }
}
