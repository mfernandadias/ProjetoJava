package CursoJava.nelio.secao10Arrays;

import java.util.ArrayList;
import java.util.List;

public class Exemplo05 {
    public static void main(String[] args){
        List<String> funcionarios = new ArrayList<>();

        funcionarios.add("Ana");
        funcionarios.add("Maria");
        funcionarios.add("Carlos");
        funcionarios.add("Amanda");
        funcionarios.add("João");

        for (String funcionario : funcionarios) {
            System.out.println(funcionario);
        }
    }
}
