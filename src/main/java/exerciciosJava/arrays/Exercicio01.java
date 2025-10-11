package exerciciosJava.arrays;

public class Exercicio01 {
    /*
    crie um vetor 5 contendo os valores de 1 a 5
    Em seguida, percorra esse vetor com um laço for e imprima
    cada valor junto com sua posição no vetor
     */

    public static void main(String[] args){
        int[] valor = {1, 2, 3, 4, 5};

        for(int i = 0; i < 5; i++){
            System.out.println(i + ": " + valor[i] ); 
        }
    }
}
