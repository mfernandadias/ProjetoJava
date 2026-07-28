package CursoJava.revisaoJava.secao05;

public class Exercicio01 {
    public static void num(){
        for(int i = 0; i <= 10; i++){
            System.out.print(i + " ");
        }
    }

    public static void pares(){
        for(int i = 2; i <= 100; i += 2){
            System.out.print( + i + " ");
        }
    }

    public static void regressiva(){
        for(int i = 10; i > 0; --i){
            System.out.print(i + " ");
        }
    }

    public static int soma(int num){
        int soma = 0;
        if(num < 0){
            return num;
        }else {
            for(int i = 1; i <= num; i++){
               soma += i;
            }
        }
        return soma;
    }

    public static void calculo(){

    }
    public static void main(String[] args){
        int soma = 0;
        num();

        System.out.println();

        pares();
        System.out.println();
        regressiva();

        soma = soma(9);
        System.out.println("\nSoma: " + soma);
    }
}
