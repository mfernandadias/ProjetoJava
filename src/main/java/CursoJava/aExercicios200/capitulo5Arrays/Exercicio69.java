package CursoJava.aExercicios200.capitulo5Arrays;

public class Exercicio69 {
    /*
    desenvolva um programa que leia 10 números inteiros e armazene-os em um array.
    Encontre e exiba o menor e o maior valor presentes no array
     */
    public static void main(String[] args){
        int[] num = {8, 9, 1, 2, 3, 4, 5,6, 2};

        int maior, menor;

        maior = menor = num[0];

        for(int numero : num){
            if(numero > maior){
                maior = numero;
            }
            if(numero < menor){
                menor = numero;
            }
        }
    }
}
