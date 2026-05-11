package CursoJava.aExercicios200.capitulo8;

public class Exercicio189 {
    /*
    escreva um programa que receba uma string e um número inteiro do usuário
    O programa deve exibir o caractere da string que está na posição indicada
    pelo número
     */
    public static void main(String[] args){
        String palavra = "Maria Fernanda dos Santos Dias";

        int num = 7;

        if(num >= 0 && num < palavra.length()){
            System.out.println("Caractere na posição " + num + ": " + palavra.charAt(num));
        }else{
            System.out.println("Indice fora do intervalo válido");
        }

    }
}
