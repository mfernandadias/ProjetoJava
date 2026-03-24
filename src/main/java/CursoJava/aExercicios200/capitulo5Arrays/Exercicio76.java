package CursoJava.aExercicios200.capitulo5Arrays;

public class Exercicio76 {
    /*
    escreva um programa que leia 10 números inteiros e verifique se algum valor é
    repetido no array
    Se houver repetições, exiba uma mensagem informando
     */
    public static void maria(String[] args){
        int[] valor = {9, 3, 4, 2, 1, 4, 2,};
        boolean repeticao = false;

        for(int i = 0; i < valor.length; i++){
            for(int j = 0; j < valor.length;j++){
                if(valor[i] == valor[j]){
                    repeticao = true;
                    break;
                }
            }
        }



    }
}
