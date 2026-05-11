package CursoJava.aExercicios200.capitulo9Strings;

public class Exercicio193 {
    /*
    crie um programa que receba uma string e verifique
    se ela começa com uma
    determina palavra, fornecida pelo usuário
    Exiba uma mensagem indicando o resultado
     */
    public static void main(String[] args){
        String name = "fernanda dias santos";

        String word = "fernanda";

        if(name.startsWith(word)){
            System.out.println("O texto inicia com a palavra Fernanda");
        }
    }
}
