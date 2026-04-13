package CursoJava.aExercicios200.capitulo7Exercicio128.exercicio139;

public class Funcionario {
    String nome;
    double salario;
    String cargo;

    public void porcentagem(double porcentagem){
        salario += salario * (porcentagem / 100);
        System.out.println("Salario com aumento: " + salario);
    }
}
