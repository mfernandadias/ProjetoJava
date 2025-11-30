package CursoJava.aComplemento.Parte5.set;

public class ExemploHashCode {
    public static void main(String[] args){
        /*
        2️⃣ hashCode()
        O que faz: Retorna um número inteiro que representa o objeto em coleções
        baseados em hash (HashMap, HashSet, etc)
        Retorno: int
        Usado em: Estruturas que precisam localizar objetos rapidamente
         */
        String a = "teste";
        String b = "teste";

        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
    }
}
