package CursoJava.aExercicios200.capitulo5Arrays.revisao;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args){
        /*
        diferença de Vetor e Array
        Enunciado: Desenvolva um programa que leia 10 números inteiros e armazene-os em um
        array. Encontre e exiba o menor e o maior valor presentes no array.
         */
        Scanner scan = new Scanner(System.in);
        int[] numeros = new int[10];
        int maior, menor;

        for(int i = 0; i < numeros.length; i++){
            System.out.println("Digite o número " + (i + 1) + ": ");
            numeros[i] = scan.nextInt();
        }

        maior = menor = numeros[0];
        for (int numero : numeros) {
            if (numero > maior) {
                maior = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
        }

        System.out.println("Número menor: " + menor);
        System.out.println("Número maior: " + maior);

        int positivos = 0;
        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] % 2 == 0){
                positivos++;
            }
        }

        System.out.println("Positivos: " + positivos);


    }
}
