package CursoJava.nelio.secao10;

public class Exercicio12 {
    public static void main(String[] args){
        /*
        Leia 8 números e mostre apenas os números positivos
         */
        int[] num = {9, 2, 3, 8, 9, 10, 3, 9, 10, 9};

        for(int i = 0; i < num.length-1; i++){
            if(num[i] % 2 == 0){
                System.out.print(num[i] + " ");
            }
        }
    }
}
