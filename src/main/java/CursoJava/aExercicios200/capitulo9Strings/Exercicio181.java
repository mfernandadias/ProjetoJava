package CursoJava.aExercicios200.capitulo9Strings;

public class Exercicio181 {
    /*
    escreva um programa que receba duas strings e compare se elas são iguais
    exibindo uma mensagem no console
     */

    public static void main(String[] args){

        String nome = "Fernanda";
        String name = "fernanda";

        if(nome.equalsIgnoreCase(name)){
            System.out.println("As palavras são iguais");
        }else{
            System.out.println("As palavras não são iguais");
        }

    }
}
