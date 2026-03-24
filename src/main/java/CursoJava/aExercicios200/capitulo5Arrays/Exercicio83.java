package CursoJava.aExercicios200.capitulo5Arrays;

public class Exercicio83 {
    /*
    crie um programa que gere e exiba uma mariz identidade 4x4 (valores 1 na diagonal principal
    e 0 nos outros elementos
     */

    public static void main(String[] args){
        int[][] matriz = new int[4][4];

        //gernado matriz identidade
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){

                //posição i e j são iguais gera o 1
                if(i == j){
                    matriz[i][j] = 1;
                }
                //posição i e j são diferentes gera o valor 0
                else{
                    matriz[i][j]= 0;
                }
            }
        }

        //exibindo matriz identidade
        System.out.println("Matriz identidade");
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

}
