package CursoJava.arrays;

public class Exercicio02 {
    public static void main(String[] args){
        /*
       crie um vetor com 6 elementos e imprima os elementos na ordem inversa
       Ou seja, se o vator for{10, 20, 30, 40, 50, 60}, a saída deve ser
         */

        int[] numeros = {2, 5, 6, 2, 8, 20};

      //imprimir em ordem inversa
        for(int i = numeros.length - 1; i >= 0; i--){
            System.out.println(numeros[i]);
        }
    }
}
