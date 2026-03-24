package CursoJava.aExercicios200.capitulo5Arrays;
import java.util.Scanner;


public class Exercicio67 {
    /*
    escreva um programa que leia 10 números inteiros e calcule a média dos
    valores inseridos, utilizando um array para armazenar os números
     */
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int[] num = new int[10];

        num[0] = 9;
        num[1] = 10;
        num[2] = 11;
        num[3] = 0;
        num[4] = 2;
        num[5] = 9;
        num[6] = 1;
        num[7] = 1;
        num[8] = 8;
        num[9] = 23;
        int soma = 0;
        int media = 0;

        for(int i = 0; i < num.length; i++){
            soma+= num[i];

        }

        media = soma / num.length;

        System.out.println("Média: " + media);




    }
}
