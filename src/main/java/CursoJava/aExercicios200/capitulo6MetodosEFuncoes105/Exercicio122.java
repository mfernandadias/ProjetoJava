package CursoJava.aExercicios200.capitulo6MetodosEFuncoes105;

public class Exercicio122 {
    /*
    implementa um método chaamdo contarVogais() que receba uma
    String como parâmetro e retorne a quantidade de vogais presentes na string
    No método main(), exiba o valor retornado

     */
    public static int contarVogais(String texto){
        int contagem = 0;
        String vogais = "aeiouAEIOU";
        for(int i = 0; i < texto.length(); i++){
            if(vogais.indexOf(texto.charAt(i)) != - 1){
                contagem++;
            }
        }
        return contagem; //retorna o número total de vogais
    }
    public static void main(String[] args){
        int totalVogais = contarVogais("Programação");

        System.out.println("Total vogais é:  " + totalVogais);


    }
}
