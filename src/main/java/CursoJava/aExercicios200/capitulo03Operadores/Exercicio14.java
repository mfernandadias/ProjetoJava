package CursoJava.aExercicios200.capitulo03Operadores;

public class Exercicio14 {
    /*
    Leia o valor de um produto.
    Se for maior que 100, aplique 10% de desconto usando operadores de atribuição (+=, -=).
     */
    public static void main(String[] args){
        double produto = 120.00;


        if(produto > 100.00){
            produto -= (produto*(10/100));

        }

        System.out.println(produto);

    }
}
