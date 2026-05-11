package CursoJava.aExercicios200.capitulo9Strings;

public class Exercicio196 {
    /*
    escreva um programa que receba uma string e
    separe as palavras
    usando espaços como demilatadores
    Exiba cada palavra em uma linha separada
     */
    public static void main(String[] args){
        String text = "maria fernanda dos santos dias dias flor alfredo bella";
        String name = "dias";

        String[] palavras = text.split(" ");
        int contador = 0;


        for(String mf : palavras){
            contador++;
        }

        System.out.println("COntador: " + contador);



    }
}
