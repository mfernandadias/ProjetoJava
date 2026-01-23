package CursoJava.aComplemento.parte7Strings;

import java.util.Date;

public class Exercicio07 {
    /*
6. Remova os espaços no início e no fim de uma string.
7. Substitua todas as ocorrências de um caractere por outro em uma string.
8. Dada uma data no formato `"dd/mm/aaaa"`, divida-a em dia, mês e ano e retorne um array.
9. Conte quantas vezes um caractere aparece em uma string.
10. Compare duas strings e retorne verdadeiro caso sejam iguais ignorando maiúsculas e minúsculas.
     */
   //Exercicio 07 -
    public static void substituicao(String palavra){
        System.out.println(palavra.replace("a", "9"));
    }
    //Exercicio 08 -
    public static void data(Date date){

    }

    //exercício 09 -
    public static void contador(String palavra, char letra){
        int contador = 0;

        for(int i = 0; i < palavra.length(); i++){
            if(palavra.charAt(i) == letra){
                contador++;
            }
        }

        System.out.println("Contador: "  + contador);
    }

    //exercicio 10 - Compare duas strings e retorne verdadeiro
    // caso sejam iguais ignorando maiúsculas e minúsculas.
    public static void igualdade(String palavra01, String palavra2){
        if(palavra2.equalsIgnoreCase(palavra2)){
            System.out.println("As palavras são iguais");
        }else{
            System.out.println("As palavras vão doferentes");
        }

    }

    //classe main
    public static void main(String[] args){
        substituicao("Fernanda");

        contador("Maria Fernanda", 'a');

        igualdade("Maria", "Maria");
    }
}
