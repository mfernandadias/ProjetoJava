package CursoJava.aExercicios200.capitulo8;

public class Exercicio191 {
    /*
    implemente um programa que receba duas strings do usuário
    e verifique se elas são
    Usando o Método contains()
     */
    public static void main(String[] args){
        String frase = "Maria Fernanda dos Santos Dias";
        String palavra = "fernanda";

        if(frase.contains(palavra)){
            System.out.println("A palavra esta contida na fresa");
        }else{
            System.out.println("A palavra não esta na frase");
        }


    }
}
