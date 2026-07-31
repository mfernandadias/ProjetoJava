package CursoJava.nelio.secao10Arrays;
import java.util.ArrayList;
import java.util.List;

public class Exemplo05List {
    public static void main(String[] args){

        List<String> nomes = new ArrayList<>();

        nomes.add("Maria");
        nomes.add("João");
        nomes.add("Carlos");

        System.out.println(nomes.get(0));

        //remove
        nomes.remove(1);

        //adicionar
        nomes.add(1, "Pedro");

        //tamanho da List
        nomes.size();

        for(int i = 0; i < nomes.size(); i++){
            System.out.println(nomes.get(i));
        }


    }
}
