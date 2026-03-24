package CursoJava.aExercicios200.capitulo6MetodosEFuncoes105;

public class Exercicio118 {
    /*
       desenvolva um método chamado ehMaiusculo() que receba um caractere e retorne
       treu se for uma letra maiu´scula, e false se for uma letra minúscula.
       No método main(), utilize o valor retornado para exibir a mensagem correspondente
        */
    public static boolean ehMaiusuculo(char caractere){
        return Character.isUpperCase(caractere);
    }

    public static void main(String[] args){

        boolean resultado = ehMaiusuculo('b'); //chaamdo do método ehMeiusculo

        if(resultado){
            System.out.println("O caractere é maiúsuclo");
        }else {
            System.out.println("O caractere não é maiúsculo");
        }





    }
}
