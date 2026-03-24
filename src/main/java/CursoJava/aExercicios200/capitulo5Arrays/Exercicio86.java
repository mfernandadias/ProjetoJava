package CursoJava.aExercicios200.capitulo5Arrays;

public class Exercicio86 {
    /*
    crie um programa que leia uma matriz 4x4 e eexiba os elementos
    da diagonal secundária
     */
    public static void main(String[] args){
        int[][] valores = {
                {8, 7, 6, 4},
                {10, 9, 9, 10},
                {10, 9, 9, 10},
                {5, 4, 3, 2}
        };

       //diagonal principal
        System.out.println("Diaigonal principal");
        for(int i = 0; i < valores.length; i++){
            System.out.print(valores[i][i] + " ");
        }

        System.out.println(" ");

        System.out.println("Diagonal Secundária");
        for(int i = 0; i < valores.length; i++){
            System.out.print(valores[i][valores.length - 1 - i]);
        }

    }
}
