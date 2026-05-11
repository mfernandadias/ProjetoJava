package CursoJava.aExercicios200.capitulo8;

public class Exercicio188 {
    /*
    implemente um programa que receba uma string e substitua todas as ocorrências
    de um caractere por outro caractere, fornecidos pelo usuário.
     */
    public static void main(String[] args){
        String palavra = "Fernanda";
        char caractere = 'a';
        char caractereNovo = 'b';

        String resultado = palavra.replace(caractere, caractereNovo);

        System.out.println(resultado);

    }
}
