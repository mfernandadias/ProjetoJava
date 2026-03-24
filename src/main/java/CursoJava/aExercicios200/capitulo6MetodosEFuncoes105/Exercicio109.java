package CursoJava.aExercicios200.capitulo6MetodosEFuncoes105;

public class Exercicio109 {
    /*
    cálculo de área de retângulo
    Desenvolva um método chamado calcularAreaRetangulo() que
    receba a largura e a altura de um retângulo como parâmetros e exiba a área
    no console. No método main() solicite os valores ao usuário
     */
    public static void retangulo(double largura, double altura){
        double area = largura * altura;
        System.out.println("Area: " + area);
    }
    public static void main(String[] args){

        retangulo(3, 4);

    }
}
