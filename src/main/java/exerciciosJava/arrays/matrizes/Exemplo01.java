package exerciciosJava.arrays.matrizes;

public class Exemplo01 {
    public static void main(String[] args){
        int[][] matriz = {
                {1, 2, 3,},
                {2, 3, 4},
                {9, 10, 12}
        };

        System.out.println("Maria Fernanda dos Santos Dias");

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }


    }
}
