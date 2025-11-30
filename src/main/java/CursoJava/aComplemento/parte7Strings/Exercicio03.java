package CursoJava.aComplemento.parte7Strings;

public class Exercicio03 {

    public static void inversaoBuilder(String palavra){
        StringBuilder bs = new StringBuilder(palavra);
        System.out.println(bs.reverse());
    }


    public static void inversaoString(String palavra){

        String novaPalavra = "";

        for(int i = palavra.length() - 1; i >= 0; i--){
            novaPalavra += palavra.charAt(i);
        }

        System.out.println(novaPalavra);
    }
    public static void main(String[] args){
        String nome = "Fernanda";

        inversaoString(nome);

        inversaoBuilder("Maria");



    }
}
