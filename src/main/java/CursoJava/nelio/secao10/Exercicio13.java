package CursoJava.nelio.secao10;

public class Exercicio13 {
    public static void main(String[] args){
        /*
       Crie um vetor de nomes e imprima usando for-each
         */
        int[] num = {9, 10, 6, 7,9, 3,2,  1, 9, 0,15};
        int conta = 0;

        for(int i : num){
            if(i % 2 == 0){
                conta++;
            }
        }
        System.out.println(conta);
    }
}
