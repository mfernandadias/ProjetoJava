package CursoJava.nelio.secao10Arrays;

public class ExemploAlturas {
    public static void main(String[] args){
        double[] alturas = {1.70, 1.65, 1.80, 1.75};

        double soma = 0;

        for(int i = 0; i < alturas.length; i++){
            soma += alturas[i];
        }

        double media = soma / alturas.length;

        System.out.println("\n Média: " + media);
    }
}
