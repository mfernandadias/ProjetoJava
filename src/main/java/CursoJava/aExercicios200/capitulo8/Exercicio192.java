package CursoJava.aExercicios200.capitulo8;
import java.util.Scanner;

public class Exercicio192 {
    /*
    implemente um programa que receba uma string e um caractere
    O programa deve exibir a posição da primeira ocorrência do caractere na string,
    ou uma mensagem informando que o caractere não foi encontrado
     */
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String nome = "Fernanda";

        System.out.println("Digite um caractere");
        char letra = scan.next().charAt(0);

        int posicao = nome.indexOf(letra);


        if(posicao !=  -1){
            System.out.println("Posicao: " + posicao);
        }else{
            System.out.println("O caractere não foi encontrado");
        }
    }
}
