package CursoJava.aExercicios200.capitulo5Arrays;

import java.util.Scanner;

public class Exercicio77 {
    /*

     */
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int[] numeros = new int[6];
        int produto = 1;

        numeros[0] = 2;
        numeros[1]= 9;
        numeros[2] = 8;
        numeros[3] = 9;
        numeros[4] = 10;
        numeros[5] = 9;

        for(int i = 0; i < numeros.length; i++){
            produto *= numeros[i];
        }

        System.out.println("O produto dos elementos do array é: " + produto);
    }
}
