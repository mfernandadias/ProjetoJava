package CursoJava.aExercicios200.capitulo7Exercicio128.exercicio137;

public class Calculadora {
    /*
    calculadora com métodos estaticos

     */
    public static double somar(double a, double b){
        return a + b;
    }

    public static double subtracao(double a, double b){
        return a - b;
    }

    public static double divicao(double a, double b){
        if(b != 0){
            return a / b;
        }else{
            System.out.println("B necessita ser diferente de zero");
            return 0;
        }
    }

    public static void main(String[] args){
        double divisao = divicao(3, 6);
        System.out.println(divisao);

    }
}
