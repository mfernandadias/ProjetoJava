package CursoJava.aExercicios200.capitulo04ControleDeFluxo;

public class Exercicio55 {
    public static void main(String[] args){
        /*
        Sequência de Fibonacci
        Escreva um programa que exiba os primeiros 10 termos da sequencia de Fibanacci
         */
        int termo1 = 0, termo2 = 1;

        System.out.println(termo1 + " " + termo2 + " ");
        for(int i = 3; i <= 10; i++){
            int proximoTermo = termo1 + termo2;
            System.out.print(proximoTermo + " ");
            termo1 = termo2;
            termo2 = proximoTermo;
        }




    }
}
