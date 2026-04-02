package CursoJava.aExercicios200.capitulo6MetodosEFuncoes105;

public class Exercicio124 {
    /*
    desenvolva um mét chamado obterMenor() que receba três
    números inteiros e retorne o menor deles. No método main(), capture o valor retornado e
    exiba o menor número
     */
    public static int valores(int a, int b, int c){
        int menor = a;
        if(b < menor){
            menor = b;
        }
        if(c < menor){
            menor = c;
        }
        return menor;
    }
}
