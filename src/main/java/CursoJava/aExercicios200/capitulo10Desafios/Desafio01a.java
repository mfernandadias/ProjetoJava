package CursoJava.aExercicios200.capitulo10Desafios;

import java.util.Random;
import java.util.Scanner;

public class Desafio01a {
    /*

     */
   public static void main(String[] args ){
       Random random = new Random();

       //
       Scanner scan = new Scanner(System.in);
       System.out.println("Digite um valor");
       int num = scan.nextInt();

       int numb = random.nextInt(100 + 1);
       int opcao = 0;


      do{
          if(num == numb){
              System.out.println(" Os números são iguals");
              break;
          }else if(num > numb){
              System.out.println(num + " é maior");
          }else {
              System.out.println(num + " é menor");
          }
          opcao++;
          System.out.println("Digite um valor");
          num = scan.nextInt();

      }while(opcao <= 3);
   }
}
