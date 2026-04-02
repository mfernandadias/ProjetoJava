package CursoJava.aExercicios200.capitulo6MetodosEFuncoes105;

public class Exercicio120 {
    /*
    crie um método chamado calcularFatorial() que receba um número inteiro e
    o fatorial desse número
    No método main(), exiba o valor retornado
     */
    public static double fatorial(double valor){
       if(valor < 0){
           throw new IllegalArgumentException("O número é menor que 0");
       }
       int fatorial = 1;
       for(int i = 1; i <= valor; i++){
           fatorial *= i;
       }
       return fatorial;
    }
    public static void main(String[] args){

        System.out.println("Fatorial: " + fatorial(9));

    }
}
