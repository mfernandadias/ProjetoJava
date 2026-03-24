package CursoJava.aExercicios200.capitulo5Arrays;

public class Exercicio68 {
    public static void main(String[] args){
        int[] num = {9, 1, 2, 3, 4, 2, 3, 4};

        for(int i = 0; i < num.length; i++){
            if(num[i] % 2 == 0){
                System.out.println(num[i]);
            }
        }
    }
}
