package CursoJava.aExercicios200.capitulo8;

public class Exercicio187{
    /*
    escreva um programa que receba uma string e exiba a versão invertida
    da string
     */
    public static void main(String[] args){
        String palavra = "Fernanda";

        StringBuilder textoInvertido = new StringBuilder(palavra);
        textoInvertido.reverse();

        System.out.println("String invertido: " + textoInvertido);


    }
}
