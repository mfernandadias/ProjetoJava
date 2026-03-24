package CursoJava.aExercicios200.capitulo5Arrays;

public class Exercicio72 {
    /*
    Desenvolva um programa que leia 10 números inteiros e
    armazene-os em um array. O progroma deve pedir ao usuário para
    inserir um número extra e contar quantas vezes esse número aparece
    no array
     */
    public static void main(String[] args) {
        int[] num = {2, 4, 5, 23, 2, 3, 4, 5, 6, 7};

        int numero = 3;
        int contagem = 0;

        for(int i = 0; i < num.length; i++){
            if(num[i] == numero){
                contagem++;
            }
        }

        System.out.println("Contagem: " + contagem);
    }

}
