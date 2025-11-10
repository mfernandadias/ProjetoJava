package CursoJava.aComplemento.Parte5;

import java.util.ArrayList;
import java.util.List;

public class ExemploEquals {
    /* 1️⃣ equals()
    O que faz: Compara se dois objetos são logicamente iguais(mesmo conteúdo),
    não importa se estão em posições diferentes na memória.
    Retorno: boolean(true ou false)
    Usadi em: Comparações diretas de objetos(obj1.euqals(obj2))

     */
    public static void main(String[] args){
        List<String> nome = new ArrayList<>();

        nome.add("Maria");
        nome.add("Mareliza");

        /// exemplo de equals
        System.out.println(nome.get(0).equals(nome.get(01)));




    }
}
