package CursoJava.aExercicios200.capitulo6MetodosRevisao;

public class Exercicio02 {

    //classe principal
    public static void main(String[] args){
        String nome = "Fernanda";

        System.out.println(nome(nome));

        System.out.println(num(8));

        //impar e par
        parOuImpar(8);

        //idade
        idade(20);

        //data
        imprimirData();
    }
    //
    public static String nome(String nome){
        return nome;
    }
    //crie um método que receba um número e imprima o dobro
    public static double num(double num){
        return num + num;
    }
    //Crie um método parOuImpar(int n) que imprima se o número é par ou ímpar.
    public static void parOuImpar(int n){
        if(n % 2 == 0){
            System.out.println("Par: " + n);
        }else{
            System.out.println("Impar: " + n);
        }
    }

    //Crie um método que receba uma idade e imprima se é maior de idade.
    public static void idade(double idade){
        if(idade >= 18){
            System.out.println("Maior de idade");
        }else{
            System.out.println("Menor de idade");
        }
    }

    //crie um método sem parâmetros que imprima a data atual(sem usar API)
    public static void imprimirData(){
        int dia = 6;
        int mes = 12;
        int ano = 2025;

        System.out.printf("Data atual: %02d/%02d/%02d%n", dia, mes, ano);
    }

}
