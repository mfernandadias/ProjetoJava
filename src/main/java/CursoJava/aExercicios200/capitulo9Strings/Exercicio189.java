package CursoJava.aExercicios200.capitulo9Strings;

public class Exercicio189 {
    public static void main(String[] args){
        /*
        escreva um programa que receba uma string e um número inteiro do
        usuário
        o programa deve exibir o caractere da string que está na posição indicada pelo
        número

         */
        String text = "alfredo jari fernanda jair bento ";

        int num = 9;

        for(int i = 0; i < text.length(); i++){
            System.out.println(text.charAt(num));
        }

    }
}
