package CursoJava.aExercicios200.capitulo7Exercicio128;

public class Pessoa {
    String nome;
    int idade;

    public static void apresentar(String nome, int idade){
        System.out.println("Nome: " + nome + "." + " Idade: " + idade );
    }

    public static void main(String[] args){
        Pessoa pessoa1 = new Pessoa();

        pessoa1.nome = "Fernanda";
        pessoa1.idade = 9;

        apresentar(pessoa1.nome, pessoa1.idade);
    }
}
