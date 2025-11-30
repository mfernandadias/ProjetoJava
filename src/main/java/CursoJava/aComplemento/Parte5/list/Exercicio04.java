package CursoJava.aComplemento.Parte5.list;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio04{
    /*
    Verificar existência e posição
    Peça ao usuário uma palavra; verifique se está na lista e imprima seu índice (ou -1 se não estiver).
    Hint: contains() e indexOf().

     */
    public static void main(String[] args){
        String fruta;
        Scanner scan = new Scanner(System.in);

        List<String> frutas = new ArrayList<>();

        frutas.add("Banana");
        frutas.add("Maça");
        frutas.add("Banana");
        frutas.add("Uva");
        frutas.add("Maracuja");

        System.out.println("Digite uma nome de uma frutas");
        fruta = scan.nextLine();

        //verifique se a fruta está na lista
        // Verificando se a fruta está na lista
        if (frutas.contains(fruta)) {
            int indice = frutas.indexOf(fruta);
            System.out.println("A fruta '" + fruta + "' está na posição: " + indice);
        } else {
            System.out.println("A fruta '" + fruta + "' não está na lista. Retorno: -1");
        }

        scan.close();
    }
}
