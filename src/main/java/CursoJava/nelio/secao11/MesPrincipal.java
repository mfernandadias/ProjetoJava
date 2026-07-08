package CursoJava.nelio.secao11;

import java.util.Scanner;

public class MesPrincipal {
    public static void main(String[] args){
        /*
        o usuario enum chamado Mes com os 12 meses do ano
        O usuário deve dirigir um número de 1 a 12 e o programa deve informar o
        nome do mês correspondente
         */
        Scanner scan = new Scanner(System.in);

        int num = 9;

        if(num >= 1 && num <= 12){
            Mes mes = Mes.values()[num - 1];
            System.out.println("Mês escolhid: " + mes);
        }else {
            System.out.println("Número inválido");
        }

        scan.close();




    }
}
