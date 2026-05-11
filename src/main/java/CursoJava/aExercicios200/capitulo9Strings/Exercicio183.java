package CursoJava.aExercicios200.capitulo9Strings;

public class Exercicio183 {
    /*
    crie um programa que receba uma string e exiba a versão
    da string convertida para letras maiusculas
     */
    public static void main(String[] args){
        String name = "fernanda";

        System.out.println(name.toUpperCase());

        /*
        escreva um programa que receba uma string e um número inteiro do usuário
        O programa deve exbir os primeiros N caracteres da string,
        onde N é o número fornecido
         */
        int num = 3;

       int n = 4;

       String nome = name.substring(0, 4);

       System.out.println(nome);

       /*
       implemente um programa que receba uma string e remova
       todos os espaços em branco, exibindo o resultado
        */
        String nameCompleto = "maria fernanda dos santos dias";
        System.out.println(nameCompleto.replace(" ", ""));



    }
}
