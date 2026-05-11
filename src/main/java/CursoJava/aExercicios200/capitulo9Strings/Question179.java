package CursoJava.aExercicios200.capitulo9Strings;

import java.util.Scanner;

public class Question179 {
    public static void main(String[] args){
        /*
        escreva um programa que receba uma string do usuário e exiba
        a mesma string console
         */
        Scanner scan = new Scanner(System.in);


        //crie um programa que receba uma string e exiba o número de caractere
        //que ela contém
        String nome = "fernanda";
        System.out.println(nome.length());

        String nome1 = "maria";
        String nome2 = "fernanda";

        String resultado = (nome1 + " " +  nome2);

        if(nome1.equalsIgnoreCase(nome2)){
            System.out.println("Os nomes são iguais");
        }else{
            System.out.println("Os nomes são diferentes");
        }

        String fruta = "BANAna";
        System.out.println(fruta.toUpperCase());
        


    }
}
