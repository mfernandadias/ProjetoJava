package CursoJava.java10x.iniciante;

import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int idade = sc.nextInt();

        String nome = sc.next();

        String frase = sc.nextLine();

        if(idade < 10){
            System.out.println("Idade inválida");
        }
        //sempre valide os dados antes de usá-los

        //switch
        //substitui vários if quando há várias opções fixos
        int opcao = 2;

        switch(opcao){

            case 1:

                System.out.println("Cadastrar");
                break;

            case 2:

                System.out.println("Excluir");
                break;

            default:

                System.out.println("Inválido");

        }

        //operação ternária
        //forma reduzida do if
        String resultado =
                idade >=18 ? "Maior" : "Menor";

        //laços de repetição
        //for - quando sabemos quantas vezes repetir
        for(int i=1;i<=5;i++){

            System.out.println(i);

        }

        //While
        //enquanto a condição for verdadeira
        int i = 1;
        while(i <= 5){
            System.out.println(i);
            i++;
        }

        //do while
        //executa pelo menos uma vez
        do{
            System.out.println("Executando");
        }while(false);

        //arrays
        //Array guarda vários valores do mesmo jogo
        int[] numeros = {10,20,30,40,50};
        System.out.println(numeros[2]);

        int[] a = {1,2,3};

        int[] b = a;

        //garbage collector
        //é o "faxineiro" do Java
        //quando um objeto não é mais usado:

        Pessoa p = new Pessoa();

        p = null;

        //arrays multidimensionais
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        //percorre toda a matriz
        for(int m = 0; i < matriz.length; m++){
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

    }
}
