package CursoJava.aExercicios200.capitulo8;

import java.util.Scanner;

public class Exercicio184 {
    public static void main(String[] args){
        /*
        escreva um programa que receba uma string e um número inteiro do usuário.
        O programa deve exibir os primeiros da string, onde N é o número fornecido.
         */
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a string: ");
        String texto = scan.nextLine();

        System.out.println("Digite um número inteiro: ");
        int num = scan.nextInt();

        String substring = texto.substring(0, num);

        System.out.println("Primeiros: " + num + " caracteres: " + substring );

    }
}
