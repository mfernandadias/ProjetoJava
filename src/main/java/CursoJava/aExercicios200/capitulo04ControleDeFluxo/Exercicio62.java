package CursoJava.aExercicios200.capitulo04ControleDeFluxo;

import java.util.Scanner;

public class Exercicio62 {
    public static void main(String[] args){
        /*
        desenvolva um programa que leia um número
        e multiplique esse número por 2 repetidmente até o
        valor exceder 1000
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("digite um valor");
        int num = scan.nextInt();

        while(num < 1000){
            num *= 2;
            System.out.println("Valor após multiplicação: " + num);
        }

        System.out.println("Numeros: " + num);

    }
}
