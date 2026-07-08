package CursoJava.nelio.secao10;

public class Exercicio11 {
    public static void main(String[] args){
        /*
        Leia um vetor e mostre o menor valor
        Leia um vetor e mostre o maior valor
         */
        int[] num = {9, 1, 2, 8, 19, 10, 8, 9, 10, 4};

        int maior = num[0];
        int menor = num[0];

        for(int i = 1; i < num.length; i++){
            if(maior < num[i]){
                maior = num[i];
            }
        }

        System.out.println(maior);

        for(int i = 1; i < num.length; i++){
            if(menor > num[i]){
                menor = num[i];
            }
        }

        System.out.println("Menor: "  + menor);

    }
}
