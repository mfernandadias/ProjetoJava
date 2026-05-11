package CursoJava.arrays.matrizes;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        for(int  i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length; j++){
                System.out.println("Digite o valor");
                matriz[i][j] = scan.nextInt();
            }
        }


    }
}
