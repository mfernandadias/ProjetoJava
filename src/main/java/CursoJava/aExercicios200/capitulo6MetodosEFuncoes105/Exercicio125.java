package CursoJava.aExercicios200.capitulo6MetodosEFuncoes105;

public class Exercicio125 {
    /*
    implemente uma classe com dois métodos chamados somar(). O priemiro método deve
    receber dois números inteiros como parâmetros inteiros e retornar a soma deles.
    O segundo métod deve receber três números inteiros e retornar a soma dos três
     No método main(), teste os dois métodos chamando-os com diferentes
    quantidades de parâmetros.
     */
    public static int somarDoisValores(int a, int b){
        return a + b;
    }

    public static int somarTresValores(int a, int b, int c){
        return a + b + c;
    }
    public static void main(String[] args){

        System.out.println("Soma dos valores: " + somarDoisValores(2, 4) );

        System.out.println("Somar três valores: " + somarTresValores(9, 10, 2));



    }
}
