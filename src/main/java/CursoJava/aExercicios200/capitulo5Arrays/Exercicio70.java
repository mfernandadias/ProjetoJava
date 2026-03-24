package CursoJava.aExercicios200.capitulo5Arrays;

public class Exercicio70 {
    public static void main(String[] args){
        /*
        escreva um programa que leai 15 números inteiros e, em seguida, exiba
        quantos desses números são positivos e quantos são negativos
         */
        int[] num = {9, 1, 2, 3, 4,1, -1, 2, -34, 5, 6, -8};

        int positivos= 0, negativos = 0;

        for(int i = 0; i < num.length; i++){
            if(num[i] > 0){
                positivos++;
            }else{
                negativos++;
            }
        }

        System.out.println("Positivo: " + positivos);

        System.out.println("Negativos: " + negativos);

        

    }

}
