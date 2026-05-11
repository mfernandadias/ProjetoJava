package CursoJava.aExercicios200.capitulo8;

public class Exercicio190 {
    public static void main(String[] args){
        /*
        implemente um programa que receba duas strings do usuário
        e verifique se elas são iguais, ignorando a diferença entre amiúsculas e
        minúsculas
         */
        String nome = "Fernanda";
        String nomea = "maria";

        if(nome.equalsIgnoreCase(nomea)){
            System.out.println("Nome iguais");
        }else{
            System.out.println("Nome diferentes");
        }
    }
}
