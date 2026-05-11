package CursoJava.aExercicios200.capitulo8;

public class Exemplos01 {
    public static void main(String[] args){
        String texto = " Olá Mundo Java: ";
        String nome = "Maria da Silva";

        texto.length(); // retorna 18

        //deixar maiúscula/minusla
        texto.toUpperCase();
        texto.toLowerCase();

        //remover pedaços da string (substring)
        System.out.println(texto.trim()); //"Olá Mundo Java!"

        //pegar pedaços da string (substring)
        String frase = "Programação em Java";

        //encontrar posição de texto
        frase.indexOf("Java");
        frase.indexOf("python");

    }
}
