package CursoJava.aComplemento.Parte5.comparableComparator;

import java.util.*;


public class Pessoa implements Comparable<Pessoa> {
    String nome;
    int idade;

    Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }


    //define ordem natural pelo nome
    @Override
    public int compareTo(Pessoa o) {
        return 0;
    }
    @Override
    public String toString() {
        return nome + " - " + idade;
    }

    public static void main(String[] args){
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Carlos", 25));
        pessoas.add(new Pessoa("Ana", 30));
        pessoas.add(new Pessoa("Bruno", 20));

        Collections.sort(pessoas); // Ordena usando compareTo
        System.out.println(pessoas);

    }
}
