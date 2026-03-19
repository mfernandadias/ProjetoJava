package CursoJava.aExercicios200.capitulo10Desafios;

public class Teste {
    /*

     */
    public static void calculadora(){
        int num = 8;
        int numb = 4;

        int opcao = 4 ;

        switch (opcao){
            case 1:
                System.out.println(num + numb);
                break;
            case 2:
                System.out.println(num - numb);
                break;
            case 3:
                System.out.println(num * numb);
                break;
            case 4:
                if(numb != 0){
                    System.out.println(num / numb);
                }else{
                    System.out.println(numb + " é igual a 0");
                }
                break;
            default:
                System.out.println("opcão indisponivel");
                break;
        }
    }

    public static void main(String[] args){
        calculadora();
    }
}
