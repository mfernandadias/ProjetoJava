package CursoJava.aExercicios200.capitulo04ControleDeFluxo;

import java.util.Scanner;

public class Exercicio60 {
    /*
    escreva um programa que leia números inteiros e exiba quantos desses números são positivos
    O programa deve parar quando usuário digitar um números negativo
     */
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um valor");
        int num = scan.nextInt();
        int positivos = 0;

        while(num >= 0){
            if(num > 0){
                positivos++;
            }
            System.out.println("Digite um valor");
            num = scan.nextInt();
        }

        System.out.println("Positivos digitados: " + positivos);


    }
}
