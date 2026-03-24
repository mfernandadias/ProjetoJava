package CursoJava.aExercicios200.capitulo5Arrays;

import java.util.Random;
import java.util.Scanner;

public class Exercicio79 {
    /*
    escreva um programa que leia 8 números inteiros everifique se os valores estão em ordem
    crescente.
    Exiba uma mensagem indicando se os números estão ou não em ordem crescente.
    Exiba uma mensagem indicando se os números estão ou não em ordem
     */
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Random gerador = new Random();

        int[] numeros = new int[8];

        boolean emOrdem = true;

        for(int i = 0; i < numeros.length; i++){
            numeros[i]= gerador.nextInt(100);
        }

        for(int n : numeros){
            System.out.print(n + " ");
        }

       for(int i = 0; i < numeros.length;i++){
           if(numeros[i] > numeros[i + 1]){
               emOrdem = false;
               break;
           }
       }

       System.out.println("  ");

       if(emOrdem){
           System.out.println("Os núemros estão em ordem crescente");
       }else{
           System.out.println("Os números NÂO estão em ordem crescente");
       }



    }
}
