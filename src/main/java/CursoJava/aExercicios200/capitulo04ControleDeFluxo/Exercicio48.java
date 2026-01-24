package CursoJava.aExercicios200.capitulo04ControleDeFluxo;

public class Exercicio48 {
    /*
    Pares de 1 a 20
     */
    public static void main(String[] args){
        double soma = 0;
        for(int i = 2; i < 20; i += 2){
            System.out.print(i + " ");
        }

        for(int i = 1; i < 100; i++){
            soma += i;
        }

        System.out.println("Soma: " + soma);

        System.out.println();

        //multiplos de 3 || entre 1 e 100

        System.out.println("Multiplos de 3: ");
        for(int i = 1; i < 100; i++){
            if(i % 3 == 0){
                System.out.print(i + " ");
            }
        }
    }
}
