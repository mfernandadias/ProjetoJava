package CursoJava.aExercicios200.capitulo6MetodosEFuncoes105;

public class Exercicio108 {
    /*
    implemente um método chamado verificarParidade() que receba um número inteiro como parâmetro e
    exiba se o número é par ou ímpar
     */
    public static void valor(int num){
        if(num % 2 == 0){
            System.out.println("Valor par");
        }else {
            System.out.println("Valor impar");
        }
    }
    public static void main(String[] args){
        valor(9);
    }
}
