package CursoJava.nelio.secao10;

import java.util.ArrayList;

public class Exercicio14 {
    public static void main(String[] args){
        //Crie um ArrayList de inteiros e adicione 5 números, depois imprima
        ArrayList<Integer> num = new ArrayList<>();
        num.add(9);
        num.add(10);
        num.add(12);
        num.add(13);
        num.add(9);
        num.add(10);
        num.add(17);
        num.add(17);
        num.add(8);
        num.add(19);
        num.add(0);
        double total = 0;
        double media = 0;

        for(int i = 0; i < num.size(); i++){
            total += num.get(i);
        }

        media = total / num.size();
        System.out.printf("%.2f", total );
        System.out.println();
        System.out.printf("%.2f", media);
    }
}
