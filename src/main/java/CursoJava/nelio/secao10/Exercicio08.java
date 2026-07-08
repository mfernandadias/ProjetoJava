package CursoJava.nelio.secao10;

public class Exercicio08 {
    public static void main(String[] args){
        /*
         */
        //Leia um vetor e mostre o maior valor.
        int[] num = {10, 8, 9, 7, 5, 1, 9, 10, 2, 8};
        int maior =  num[0];
        int menor = num[0];


        for(int i = 1; i < num.length; i++){
            if(num[i] > maior){
                num[i] = maior;
            }
        }



    }
}
