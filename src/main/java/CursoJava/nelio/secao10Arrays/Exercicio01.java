package CursoJava.nelio.secao10Arrays;

public class Exercicio01 {
    public static void main(String[] args){
        int[] num = {2, 4, 5, 7, 8};
        int soma = 0;

        for(int i = 0; i < num.length; i++){
            System.out.println(num[i]);
            soma += num[i];
        }

        System.out.println("\n Soma: " + soma);
    }
}
