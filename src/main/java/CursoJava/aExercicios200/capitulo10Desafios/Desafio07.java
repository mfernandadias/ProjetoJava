package CursoJava.aExercicios200.capitulo10Desafios;

public class Desafio07 {
    /*
    escreva um programa que receba uma string e conte quantas vogais existem nela
     */
    public static void main(String[] args){
        String nome = "Maria fernanda dos santos dias";

        int contagemVogais = 0;
        for(char c : nome.toCharArray()){
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                contagemVogais++;
            }
        }

        System.out.println("Número de vogais: " + contagemVogais);

    }
}
