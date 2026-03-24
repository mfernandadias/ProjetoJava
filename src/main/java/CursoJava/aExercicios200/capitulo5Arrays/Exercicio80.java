package CursoJava.aExercicios200.capitulo5Arrays;

import java.util.Random;

public class Exercicio80 {
    /*
    Crie um programa que declare uma matriz 3x3 e permita que o usuário insira
    valores inteiros para preencher essa matriz. Em seguida, exiba os valores da matriz no
console

     */
    public static void main(String[] args){
        Random random = new Random();

        int[][]  matriz = new int[3][3];
        int soma = 0;

        for(int i = 0; i < matriz.length; i++ ){
            for(int j = 0; j < matriz.length; j++){
                matriz[i][j] = random.nextInt(100);
                soma += matriz[i][j];
            }
        }

        for(int i = 0; i < matriz.length; i++ ){
            for(int j = 0; j < matriz.length; j++){
                System.out.print(matriz[i][j] + " ");

            }
            System.out.println("");
        }

        System.out.println("Soma: " + soma);
    }
}
