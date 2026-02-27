package CursoJava.aExercicios200.capitulo10Desafios;

public class Desafio03 {
    /*
    Enunciado: Crie um programa que receba uma string e
    conte quantas palavras existem nela.

     */
    public static void contadorPalavras(String text) {
        String[] palavra = text.split(" ");


        System.out.println("Contador: " + palavra.length);
    }

    public static void main(String[] args) {

        contadorPalavras("maria fernanda dos santos dias dias dias maria");
    }
}
