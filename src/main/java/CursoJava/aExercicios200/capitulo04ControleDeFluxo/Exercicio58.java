package CursoJava.aExercicios200.capitulo04ControleDeFluxo;

import java.util.Scanner;

public class Exercicio58 {
    public static void main(String[] args){
        /*
        crie um programa que leia um número entre 1 a 10.
        Caso o valor seja inválido, continue pedindo a entrada até que um número seja
        fornecido
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite  um valor");
        int num = scan.nextInt();

        while(num < 0){
            System.out.println("O valor necessita ser maior que 0");
            System.out.println("Digite  um valor");
            num = scan.nextInt();
        }

        System.out.println("Valor Válido: " + num);

    }
}
