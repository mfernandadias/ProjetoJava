package CursoJava.aExercicios200.capitulo5Arrays;

public class Exercicio65 {
    public static void main(String[] args){
        int[] valor = new int[5];

         valor[0] = 1;
         valor[1] = 0;
         valor[2] = 3;
         valor[3] = 8;
         valor[4] = 9;
         int soma = 0;

         for(int i = 0; i < valor.length; i++ ){
             soma += valor[i];
         }

         System.out.println("Soma: " + soma);

    }
}
