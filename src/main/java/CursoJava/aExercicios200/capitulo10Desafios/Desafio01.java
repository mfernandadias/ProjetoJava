package CursoJava.aExercicios200.capitulo10Desafios;

import java.util.Scanner;

public class Desafio01 {
    /*
    Enunciado: Crie uma calculadora que permita ao usuário realizar operações matemáticas
básicas (soma, subtração, multiplicação e divisão). O usuário deve poder inserir dois
números e escolher a operação desejada.

     */
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um valor");
        double valor = scan.nextDouble();

        System.out.println("Digite um segundo valor");
        double valorb = scan.nextDouble();
        int escolha;


        do {
            System.out.println("Escolha uma operação adição, dubtracao, multiplicação e divisão");
            escolha = scan.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println(valor + valorb);
                    break;
                case 2:
                    System.out.println(valor - valorb);
                    break;
                case 3:
                    System.out.println(valor * valorb);
                    break;
                case 4:
                    if (valorb !=   0) {
                        System.out.println(valor / valorb);
                    } else {
                        System.out.println("Valor B necessita ser maior que 0");
                    }
                    break;
                default:
                    System.out.println("Escolha incorreta");
                    break;
            }

        }while(escolha< 0 || escolha > 4);
    }
}
