package CursoJava.aExercicios200.capitulo6MetodosEFuncoes105;

public class Exercicio114 {
    /*
    implemente um método chaamdo potencia() que receba dois números inteiros (base e
    expoente) e retorne o resultado da potenciação.

     */
    public static Double potenciacao(double valor, double potencia){
        return Math.pow(valor, potencia);
    }
    public static void main(String[] args){

        System.out.println(potenciacao(3, 2));

    }
}
