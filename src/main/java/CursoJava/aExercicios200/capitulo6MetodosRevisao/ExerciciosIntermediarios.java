package CursoJava.aExercicios200.capitulo6MetodosRevisao;

public class ExerciciosIntermediarios {
    public static void main(String[] args){

        int numero = 17;

        if(ehPrimo(numero)){

        }
    }

    //Crie um método que receba um número e retorne se ele é primo.
    public static boolean ehPrimo(int numero){
        if(numero <= 1){
            return false;
        }

        // Verifica divisores de 2 até a raiz do número
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false; // Não é primo
            }
        }
        return true;
    }

    //Crie um método que calcule a média de três notas.
    public static void media(double a, double b, double c){
        double media = (a + b + c) / 3;
        System.out.println("Media: " + media);
    }

    //crie um string e retorne seu tamanho
    public static void palavra(String word){
        System.out.println(word.length());
    }

    //Crie um método que receba um número e retorne o fatorial.

}
