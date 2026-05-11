package CursoJava.aExercicios200.capitulo9Strings;

public class Exercicio186 {
    /*
    crie um programa que receba uma string e um caractere
    o programa deve contar e exibir quantas vezes o caractere aparece na string
     */
    public static void main(String[] args){
        String name = "alfred bella bella maria fernanda";
        int contador = 0;
        char letra = 'a';

        for(int i = 0; i < name.length();i++){
            if(name.charAt(i) == letra){
                contador++;
            }
        }
        System.out.println("Contador: " + contador);
    }
}
