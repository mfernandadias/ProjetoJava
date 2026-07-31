package CursoJava.nelio.secao10Arrays;

public class Exemplo01 {
    public static void teste(){
        int numero = 10;

        System.out.println(numero);
    }
    public static void main(String[] args){
        Pessoa pessoa = new Pessoa();
        pessoa = null;

        // O objeto Pessoa não possui mais referência.
        // O Garbage Collector poderá liberar essa memória.

        teste();
    }
}
