package CursoJava.aExercicios200.capitulo7Exercicio128.exercicio136;

public class Aluno {
    String nome;
    double nota1;
    double nota2;

    public void media(){
        double media = (nota1 + nota2) / 2;
        System.out.println("Media: " + media);
    }

    public static void main(String[] args){
        Aluno aluno2 = new Aluno();
        aluno2.nome = "Fernanda";
        aluno2.nota1 = 9;
        aluno2.nota2= 10;

        aluno2.media();
    }
}
