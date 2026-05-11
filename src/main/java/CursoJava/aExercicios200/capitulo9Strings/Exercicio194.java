package CursoJava.aExercicios200.capitulo9Strings;

public class Exercicio194 {
    /*
    desenvolva um programa que receba uma string e verifique se ela
    termina com uma determinada palavra
    exiba o resultado no console
     */
    public static void main(String[] args){
        String name = "fernanda dias";
        String mf = "dias";

        if(name.endsWith(mf)){
            System.out.println("A string termina com " + mf);
        }else{
            System.out.println("A string não termina com " + mf);
        }

    }
}
