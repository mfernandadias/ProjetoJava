package CursoJava.aComplemento.parte7Condicionais;

public class ExemploSwitch {
    public static void main(String[] args){
        int dia = 5;

        String nomeDia = switch(dia){
            case 1 -> "Domingo";
            case 2 -> "Segunda";
            case 3 -> "Terça";
            case 5 -> "Sexta";
            default -> "Dia Inválido";
        };


    }
}
