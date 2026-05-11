package CursoJava.aExercicios200.capitulo9Strings;

public class Exercicio191 {
    /*
    escreva um programa que receba uma string e uma palavra.
    O programa deve verificar se a palavr está contida na string e exibir uma
    mensagem correnpondente

     */
    public static void main(String[] args){
        String text = "fernanda alfredo jair maria fernanda dias";
        String word = "alfredo";

        if(text.contains(word)){
            System.out.print("sim");
        }else{
            System.out.println("Não");
        }
    }
}
