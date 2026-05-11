package CursoJava.aExercicios200.capitulo9Strings;

public class Exercicio195 {
    public static void main(String[] args){
        /*
        implemente um programa que receba uma string e
        substitua todas as ocorrências de uma palavra
        por outra, ambas fornecidas pelo usuário
        */

        String text = "maria flor fernanda dos santos dias dias alfredo mareliza";
        String word = "dias";

        System.out.println(text.replace("dias", "flor"));


    }
}
