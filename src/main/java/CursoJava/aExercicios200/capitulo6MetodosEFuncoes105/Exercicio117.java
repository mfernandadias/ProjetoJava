package CursoJava.aExercicios200.capitulo6MetodosEFuncoes105;

public class Exercicio117 {
    /*
    escreva um método chaamdo calcularMedia() que receba três números inteiros e
    retorne a média aritmética deles. No método main(), exiba a média, retornada

     */
    public static Double media(double a, double b, double c){
        double media = (a + b + c ) / 3;
        return media;
    }

    public static void main(String[] args){
        System.out.println(media(9, 8, 1));
    }
}
