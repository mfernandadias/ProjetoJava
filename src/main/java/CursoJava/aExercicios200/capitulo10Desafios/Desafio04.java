package CursoJava.aExercicios200.capitulo10Desafios;

import java.util.Random;
import java.util.Scanner;

public class Desafio04 {
    /*
    desenvolva um jogo em que o programa escolhe um número aleatório entre 1
    e 100, e o usuário tentar adivinhar esse número.
    O programa deve fornecer dicas se o aplpite for maior ou menor que o número secreto

     */
   public static void adivinhacao(int num){
       Random random = new Random(100);

       int numeroSecreto = random.nextInt(100) + 1;
       int palpite;
       boolean acertou = false;

       System.out.println("Tente adininhas o número entre 1 e 100");
       while(!acertou){

       }
   }
   public static void main(String[] args){

   }
}
