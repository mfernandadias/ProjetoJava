package CursoJava.aExercicios200.capitulo5Arrays;

public class Exercicio73 {
    /*
    escreva um programa que crie um array de 5 números in
     */
    public static void main(String[] args){

        int[] valor = {4, 6, 5,3, 1};

        int[] valorb = new int[valor.length];

        for(int i = 0; i < valor.length; i++){
            valorb[i] = valor[i] * 2;
        }

        for(int i = 0; i < valor.length; i++){
            System.out.print(valorb[i] + " ");
        }
    }
}
