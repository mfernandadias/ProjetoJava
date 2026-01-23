package CursoJava.aExercicios200.capitulo04ControleDeFluxo;

public class Exercicio41 {
    public static void main(String[] args){
        /*
        escreva um programa que leia um número de 1 a 7 e exiba o nome do dia da semana
        correspondente(1 para domingo, 2 para segunda, etc).
         */
        int valor = 3;

        switch (valor){
            case 1:
                System.out.println("Segunda feira");
                break;
            case 2:
                System.out.println("Terça feira");
                break;
            case 3:
                System.out.println("Quarta feira");
                break;
            default:
                System.out.println("Valor inválido");
                break;
        }
    }
}
