package CursoJava.revisaoJava.metodos;

public class Exemplos01 {
    //metodo sem par^metro e sem retorno
    public static void mensagem(){
        System.out.println("Olá, mundo");
    }

    //metodo com parametro e sem retorno
    public static void saudar(String nome){
        System.out.println("Olá " + nome);
    }

    //metodo sem parametro e com retorno
    public static int numero(){
        return 10;
    }

    //metodo com parametro e com retorno
    public static int quadrado(int n){
        return n * n;
    }

    //metodo com retorna boolean
    public static boolean maiorDeIdade(int idade){
        if(idade >= 18){
            return true;
        }
        return false;
    }

    //escrita mais simples
    public static boolean maiorDe(int idade){
        return idade >= 18;
    }

    //metodo que retorna String
    public static String nomeCompleto(String nome, String sobrenome){
        return nome + " " + sobrenome;
    }

    //metodo com varios paramateros
    public static double medio(double n1, double n2, double n3){
        return (n1 + n2 + n3) / 3;
    }

    public static void main(String[] args){
        saudar("Maria");
        saudar("João");

        quadrado(4);
    }

}
/*
Resumo dos tipos de métodos
| Tipo                       | Exemplo                           |
| -------------------------- | --------------------------------- |
| Sem parâmetro, sem retorno | `void mensagem()`                 |
| Com parâmetro, sem retorno | `void saudar(String nome)`        |
| Sem parâmetro, com retorno | `int numero()`                    |
| Com parâmetro, com retorno | `int soma(int a, int b)`          |
| Retorna `boolean`          | `boolean maiorDeIdade(int idade)` |
| Retorna `String`           | `String nomeCompleto(...)`        |
| Retorna `double`           | `double media(...)`               |

 */

//Expressoes comparativas
/*
expressoa --> valor verdade
5>10 --> Falso
 */