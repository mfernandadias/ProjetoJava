package CursoJava.aExercicios200.capitulo04ControleDeFluxo;

public class Exercicio33 {
    public static void main(String[] args){
        double produto = 90;

        if(produto > 70){
            produto -= produto*0.10;
        }

        System.out.println(produto);
    }
}
