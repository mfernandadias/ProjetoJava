package CursoJava.aExercicios200.capitulo5Arrays;

public class Exercici078 {
    /*
    desenvolva um programa que crie dois arrays de 5 números inteiros.
    O programa deve comparar os dois arrays e exibir quais posições possuem valores iguais

     */
    public static void main(String[] args){
        int[] numA = {8, 9, 2, 3, 1};
        int[] numB = {9, 0, 1, 2, 1};

        for(int i = 0; i < numA.length; i++ ){
            if(numA[i] == numB[i]){
                System.out.println("Posição:  " + i);
                System.out.println("Valores iguais: " + numB[i] +" " +  numA[i]);

            }
        }
    }
}
