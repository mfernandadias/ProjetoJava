package CursoJava.aExercicios200.capitulo10Desafios;

/*
Fatorial Recursivo
desenvolva uma função recursiva que calcule o fatorial de um número fornecido pelo usuário
 */


public class Desafio08 {

   public static int fatorial(int n){
       if(n == 0){
           return 1;
       }
       return n * fatorial(n - 1);
   }

   public static void main(String[] args){
       int num = 9;

       System.out.println(fatorial(num)) ;
   }
}
