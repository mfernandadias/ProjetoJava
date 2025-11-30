package CursoJava.aComplemento.parte7Strings;

public class Exercicio04 {

    //Verifique se uma string contém outra substring.

    public static void contem(String palavra, String segundaPalavra){
        if(palavra.contains(segundaPalavra)){
            System.out.println(segundaPalavra + " esta contida da String");
        }else{
            System.out.println("Não esta contida");
        }

    }
    public static void main(String[] args){
        contem("Maria Fernanda", "Maria");
    }
}
