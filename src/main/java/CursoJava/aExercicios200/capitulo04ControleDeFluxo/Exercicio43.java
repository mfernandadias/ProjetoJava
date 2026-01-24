package CursoJava.aExercicios200.capitulo04ControleDeFluxo;

import java.util.Scanner;

public class Exercicio43 {
    /*
    desenvolva um programa que leia dois números e um operador(+, -, *, /) e
    realize a operação correspondente.Exiba o resultado no console

     */
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = 9;
        int b = 10;

        System.out.println("Digite um simbolo para realizar a operação dos valores");
        char operador = scan.next().charAt(0);

        switch (operador){
            case '+':
                System.out.println("Soma: " + (a + b));
                break;
            case '-':
                System.out.println("Subtração" + (a - b));
                break;
            case '*':
                System.out.println("Multiplicação: " + (a * b));
                break;
            default:
                System.out.println("Simbolo incorreto");
                break;
        }


    }
}
