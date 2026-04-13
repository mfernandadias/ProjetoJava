package CursoJava.aExercicios200.capitulo7Exercicio128.exercicio133;

public class ClassePrincipal {
    public static void main(String[] args){
        Turma turma1 = new Turma();
        turma1.nome = "Turma 1";

        Aluno aluno1 = new Aluno();
        aluno1.nome = "Maria Fernanda";
        aluno1.turma = turma1;

        aluno1.exibirDados();
    }
}
