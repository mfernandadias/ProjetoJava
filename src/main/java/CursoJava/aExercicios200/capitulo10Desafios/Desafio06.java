package CursoJava.aExercicios200.capitulo10Desafios;
import java.util.Arrays;
import java.util.Scanner;


public class Desafio06 {
    /*
    crie um programa que receba uma lista de número do usuário e os ordene em ordem crescente
     */
   public static void main(String[] args){
       Scanner scan = new Scanner(System.in);

       System.out.println("Digite o tamanho que será seu vetor");
       int valor = scan.nextInt();

       int[] num = new int[valor];


       for(int i = 0; i < valor; i++){
           System.out.println("Digite o valor");
           num[i] = scan.nextInt();
       }

       Arrays.sort(num);

       System.out.println("Números em ordem crescente: " + Arrays.toString(num));
   }
}
