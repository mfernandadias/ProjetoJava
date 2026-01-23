package CursoJava.aExercicios200.capitulo04ControleDeFluxo;

public class Exercicio36 {
    /*
    desenvolva um programa que leia trÊs números inteiros e exiba o maior deles.
    Caso dois ou mais números sejam iguais, exiba uma mensagem indicando que há números
    iguais
     */
    public static void main(String[] args){
        int num1 = 8;
        int num2 = 9;
        int num3 = 9;

        if (num1 == num2 && num2 == num3) {
            System.out.println("Todos os números são iguais.");
        } else if (num1 >= num2 && num1 >= num3) {
            System.out.println("O maior número é: " + num1);
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("O maior número é: " + num2);
        } else {
            System.out.println("O maior número é: " + num3);
        }


    }

}
