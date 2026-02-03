package CursoJava.aExercicios200.capitulo04ControleDeFluxo;

import java.util.Scanner;

public class Exercicio64 {
    /*
    crie um programa que exiba um menu de opções e permite ao usuário escolher uma ação
    (como somar dois números, subtrair, etc). O menu deve continuar
    sendo exibido até o usuário escolher a opção de sair
     */
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Menu de Opções: ");
            System.out.println("1 - Somar dois números");
            System.out.println("2 - Subtrair dois números");
            System.out.println("3 - Multiplicar dois números");
            System.out.println("4 - Divisão de dois números");
            System.out.println("5 - Sair");
            System.out.println("Escolha uma opção");
            opcao = scan.nextInt();

            if (opcao >= 1 && opcao <= 4) {
                System.out.print("Digite o primeiro número: ");
                double num1 = scan.nextDouble();
                System.out.print("Digite o segundo número: ");
                double num2 = scan.nextDouble();
                switch (opcao) {
                    case 1:
                        System.out.println("Resultado: " + (num1 +
                                num2));
                        break;
                    case 2:
                        System.out.println("Resultado: " + (num1 -
                                num2));
                        break;
                    case 3:
                        System.out.println("Resultado: " + (num1 *
                                num2));
                        break;
                    case 4:
                        if (num2 != 0) {
                            System.out.println("Resultado: " + (num1 /
                                    num2));
                        } else {
                            System.out.println("Erro: Divisão por zero não é permitido");
                        }
                }
            }

                }
                while (opcao != 5);

                System.out.println("Programa encerrado");

            }

}
