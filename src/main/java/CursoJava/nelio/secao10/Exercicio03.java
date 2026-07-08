package CursoJava.nelio.secao10;

public class Exercicio03 {
    //leia 8 números e mostre apenas os números positivos
    public static void main(String[] args){
        /*

         */
        int[] valor = {9, 1, 4, 8, 10, 6, 2, 0, 2, 18};

        for(int i = 0; i < valor.length; i++){
            if(valor[i] % 2 == 0){
                System.out.print(valor[i] + " ");
            }
        }
    }
}
