package CursoJava.aExercicios200.capitulo7Exercicio128.exercicio133;

public class Aluno {
    String nome;
    Turma turma;

    public void exibirDados(){
        System.out.println("Aluno: " + nome);
        turma.ExibirNome();
    }
}
