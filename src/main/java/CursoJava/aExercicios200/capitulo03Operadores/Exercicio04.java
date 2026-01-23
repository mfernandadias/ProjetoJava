package CursoJava.aExercicios200.capitulo03Operadores;

public class Exercicio04 {
    /*
    resto da dibvisão
    leia dois n úmeros e mostre o resto da divisão usando %
     */
    public static void main(String[] args) {
        int a = 9;
        int b = 4;

        double divisao = a % b;

        System.out.println("Resto: " + divisao);

        /*
        leia um número e mostre
        Valor original
        valor após ++
         */
        int g = 9;

        System.out.println(g);
        g++;
        System.out.println(g);

        //decremento
        g--;
        System.out.println(g);

        /*
        Operadores Relacionais
        Leia dois dúmeros
        se são iguais
        se o primeiro é maior que o segundo
         */
        int h = 9;
        int y = 10;


        if(h == y){
            System.out.println("Os valores são iguais");
        }else{
            System.out.println("OS valores são diferentes");
        }

        if(h > y){
            System.out.println("O primeiro valor é maior que o segundo");
        }else{
            System.out.println("O segundo livro é maior que o primeiro");
        }
    }

}