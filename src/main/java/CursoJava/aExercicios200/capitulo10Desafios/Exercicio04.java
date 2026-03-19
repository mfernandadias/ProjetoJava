package CursoJava.aExercicios200.capitulo10Desafios;
import java.util.Random;
import java.util.Scanner;

public class Exercicio04 {
    /*
    Desafio 4: Jogo da Adivinhação
Enunciado: Desenvolva um jogo em que o programa escolhe um número aleatório entre 1
e 100, e o usuário deve tentar adivinhar esse número. O programa deve fornecer dicas se o
palpite for maior ou menor que o número secreto.

     */
    public static void main(String[] args){

        Random random = new Random();
        Scanner scan = new Scanner(System.in);

        int palpite = random.nextInt(100);
        boolean acertou = false;

        System.out.println("Digite o número de digitalização");
        int numAdivinhacao = scan.nextInt();

      while(!acertou){
          System.out.println("Digite seu palpite");
          palpite = scan.nextInt();

          if(palpite == numAdivinhacao){

          }
      }


    }
}
