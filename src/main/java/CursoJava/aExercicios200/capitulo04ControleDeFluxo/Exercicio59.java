package CursoJava.aExercicios200.capitulo04ControleDeFluxo;

import java.util.Scanner;

public class Exercicio59 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("digite um valor");
        int valor = scan.nextInt();
        int soma = 0;

        while(valor != 0){
            soma += valor;
            System.out.println("Digite um valor");
            valor = scan.nextInt();
        }

        System.out.println(soma);

    }
}
