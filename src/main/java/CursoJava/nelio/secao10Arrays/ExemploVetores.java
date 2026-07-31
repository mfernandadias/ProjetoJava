package CursoJava.nelio.secao10Arrays;

public class ExemploVetores {
    public static void main(String[] args){
        //um vetor (array) permite armazenar vários valores do mesmo tipo
        int[] notas = {9, 19, 2, 8, 0, 12};

        System.out.println(notas[0]);
        System.out.println(notas[1]);
        System.out.println(notas[2]);
        System.out.println(notas[3]);

        int[] numeros = new int[5];
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;

        //length - para descobrir o tamanho
        System.out.println(numeros.length);

        //percorrer vetores com for
        //um dos usos mais importantes de vetores
        System.out.println();
        int[] num = {10, 20, 30, 40, 50};
        for(int i = 0; i < num.length; i++){
            System.out.println(num[i]);
        }
    }
}
