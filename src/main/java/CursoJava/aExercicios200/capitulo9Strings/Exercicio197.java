package CursoJava.aExercicios200.capitulo9Strings;

public class Exercicio197 {
    /*
    implemente um programa que receba uma string com espaços em excesso
    no início e no fim, e exiba a string "limpa", sem esses espaços,
    utilizando o método trim();
     */
    public static void main(String[] args){
        String name = " maria fernanda dos santos dias dias flor";

        String limpa = name.trim();

        System.out.println(limpa);

    }
}
