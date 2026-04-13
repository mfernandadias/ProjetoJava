package CursoJava.aExercicios200.capitulo7Exercicio128;

public class Carro {
    /*

     */
        String marca;
        String modelo;
        int ano;


    public static void main(String[] args){
        Carro meuCarro = new Carro();  //criando o objeto Carro

        meuCarro.marca = "Toyota";
        meuCarro.modelo = "Corolla";
        meuCarro.ano = 2020;

        //exibindo os valores dos atributos
        System.out.println("Marca: " + meuCarro.marca);
        System.out.println("Modelo: " + meuCarro.modelo);
        System.out.println("Ano: " + meuCarro.ano);


    }

}
