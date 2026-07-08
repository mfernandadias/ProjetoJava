package CursoJava.nelio.secao10;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args){
        /*
        Leia 8 números e mostre apenas os números positivos.
         */
        Scanner sc = new Scanner(System.in);

        int[] num = new int[10];

        for(int i = 0; i < num.length; i++){
            System.out.println("Digite um número par para a posição " + i + ": ");
            num[i] = sc.nextInt();

            while(num[i] % 2 != 0){
                System.out.println("Número inválido! Digite um número PAR: ");
                num[i] = sc.nextInt();
            }
        }

        System.out.println("Números armazenados no vetor: ");

        for(int i = 0; i < num.length; i++){
            System.out.println("Posição " + i + ": " + num[i]);
        }

        sc.close();
    }
}
