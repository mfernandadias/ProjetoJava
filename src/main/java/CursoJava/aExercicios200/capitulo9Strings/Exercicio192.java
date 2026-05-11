package CursoJava.aExercicios200.capitulo9Strings;

public class Exercicio192 {
    /*
    implementa um programa que receba uma string e um caractere
    o programa deve exibir a posição da primeira ocorrência do caractere
    na string, ou uma mensagem informando que o caracetre não foi encontrado
     */

    public static void main(String[] args){
        String name = "fernanda dias maria mareliza";
        char letra = 'a';

        for(int i = 0; i < name.length(); i++){
            if(name.charAt(i) == letra){
                System.out.println(i + 1);
                break;
            }
        }

    }
}
