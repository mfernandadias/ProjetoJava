package CursoJava.aExercicios200.capitulo10Desafios;

import java.util.Scanner;

public class Desafio02 {
    /*Enunciado: Implemente um programa que receba uma palavra
    ou frase e verifique se ela é
      um palíndromo (se lê da mesma forma de frente para trás).

         */
    public static void palindromo(String name){
        StringBuilder palavra = new StringBuilder(name);

        palavra.reverse();

        if(palavra.toString().equals(name)){
            System.out.println("A palavra é palindromo");
        }else{
            System.out.println("as palavras são diferente");
        }
    }

    public static void main(String[] args){
        palindromo("ovo");
    }
}
