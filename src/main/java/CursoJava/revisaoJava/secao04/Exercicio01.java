package CursoJava.revisaoJava.secao04;

public class Exercicio01 {
    public static  Integer num(int n) {
        if (n > 0) {
            System.out.println("Positivo");
        } else {
            System.out.println("Negativo");
        }
        return n;

    }
        public static void main (String[]args){
            int dia = 3;

            switch (dia) {
                case 1:
                    System.out.println("Domingo");
                    break;
                case 2:
                    System.out.println("Segunda");
                    break;
                case 3:
                    System.out.println("Terça");
                    break;
                default:
                    System.out.println("Dia inválido");
            }
            num(8);
        }

}
