package CursoJava.aExercicios200.capitulo04ControleDeFluxo;

import java.util.Scanner;

public class Exercicio61 {
    public static void main(String[] args){
        /*
        crie  um programa que leia um número inteiro positivo e encontre raiz
        quadrada aproximada desse número. Continue a tentativa até encontrar
        a aproximação  correta
         */
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um valor");
        int n = scan.nextInt();
        int raizAprox = 0;

        while(raizAprox * raizAprox < n){
            raizAprox++;

            if(raizAprox * raizAprox == n){
                System.out.println("Raiz quadrada são iguais ");
            }else{
                System.out.println("Raiz quadrada aproximada de " + n + "é: " + raizAprox);
            }
        }

    }
}
