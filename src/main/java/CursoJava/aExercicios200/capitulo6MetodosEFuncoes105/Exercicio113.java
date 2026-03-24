package CursoJava.aExercicios200.capitulo6MetodosEFuncoes105;

public class Exercicio113 {
    /*
    escreva um método chaamdo calcularAreaRetangulo() que receba a largura
    e a altura de um retãngulo e retorne a área calculada. No método main(),
    exiba a área retornada
     */
    public static Double calcularAreaRetangulo(double largura, double altura){
        return largura * altura;
    }

    public static void main(String[] args){
        double calcular = calcularAreaRetangulo(9, 8);

        System.out.println(calcular);
    }

}
