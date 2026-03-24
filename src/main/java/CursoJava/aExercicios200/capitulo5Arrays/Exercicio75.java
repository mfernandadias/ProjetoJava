package CursoJava.aExercicios200.capitulo5Arrays;

public class Exercicio75 {
    /*

     */
    public static void main(String[] args){
        int[] valor = {9, 5, 4, 5, 2, 43, 47};
        int valora = 9;
        int valorb = 1092;



        for(int i = 0; i < valor.length; i++){
            if(valor[i] == valora){
                valor[i] = valorb;
            }
        }

        for(int num : valor){
            System.out.print(num + " ");
        }
    }
}
