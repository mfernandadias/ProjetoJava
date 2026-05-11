package CursoJava.aExercicios200.capitulo8;

public class Exercicio186 {
    /*
    crie um programa que receba uma string e um caractere.
    O programa deve contar e exibir quantas vezes o caractere
    aparece na string
     */
    public static void main(String[] args){
        String nome = "maria fernanda";
        char letra = 'a';

        int contador = 0;
        for(int i = 0; i < nome.length(); i++){
            if(nome.charAt(i) == letra){
                contador++;
            }
        }

        System.out.println(contador);
    }
}
