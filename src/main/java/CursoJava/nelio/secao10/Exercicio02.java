package CursoJava.nelio.secao10;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] vetor = new int[10];

        for (int i = 0; i < vetor.length; i++) {

            System.out.print("Digite um número par: ");
            int numero = sc.nextInt();

            if (numero % 2 == 0) {
                vetor[i] = numero;
            } else {
                System.out.println("Número inválido!");
                i--;
            }
        }

        System.out.println("Vetor:");

        for (int numero : vetor) {
            System.out.println(numero);
        }

        sc.close();
    }
}
