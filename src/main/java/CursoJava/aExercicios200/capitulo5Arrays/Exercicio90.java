package CursoJava.aExercicios200.capitulo5Arrays;

public class Exercicio90 {

    public static void main(String[] args){
        /*
        crie um programa que leia 10 números inteiros e um número adicional.
        O programa deve realizar uma busca linear no array para verificaar se o
        número adicional está presente. Exiba a posição do número,
        se encontrado
         */
        int[] valores = {9, 10, 2, 3, 4, 5, 6, 2, 8, 9};
        int valor = 2;

        for(int i = 0; i < valores.length; i++){
            if(valores[i] == valor){
                System.out.println("Posição: " + i);
            }else{
                System.out.println("Nâo encontrado");
            }
        }
    }
}
