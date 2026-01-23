package CursoJava.aExercicios200.capitulo03Operadores;

public class Exercicio13 {
    /*
    Leia um número e mostre
    "Positivo" se for >= 0
    "negativo" caso contrário
    Use: ? :
     */
    public static void main(String[] args){
        int idade = 20;

        String status = (idade >= 0) ? "Positivo" : "Negativo";

        System.out.println(status);



    }
}
