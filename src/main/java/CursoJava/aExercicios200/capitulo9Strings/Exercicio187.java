package CursoJava.aExercicios200.capitulo9Strings;

public class Exercicio187 {
    /*
    escreva um programa que receba uma string e exiba a versão invertida da string
     */
    public static void main(String[] args){
        String name = "fernanda";


        StringBuilder nome = new StringBuilder(name);

        nome.reverse();

        System.out.println(nome);
    }

}
