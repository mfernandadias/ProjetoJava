package CursoJava.aExercicios200.capitulo10Desafios;
import java.util.Scanner;

public class Desafio05 {
    /*
    Enunciado: Implemente um validador de senha que verifique se a senha do usuário atende
aos seguintes critérios: no mínimo 8 caracteres, contém pelo menos um número, uma letra
maiúscula, uma letra minúscula e um caractere especial.

     */

    public static boolean validarSenha(String senha) {
        if (senha.length() < 8) return false;

        boolean temMaiuscula = false, temMinuscula = false, temNumero = false, temEspecial = false;

        for (char c : senha.toCharArray()) {
            if (Character.isUpperCase(c)) temMaiuscula = true;
            if (Character.isLowerCase(c)) temMinuscula = true;
            if (Character.isDigit(c)) temNumero = true;
            if (!Character.isLetterOrDigit(c)) temEspecial = true;
        }
        return temMaiuscula && temMinuscula && temNumero && temEspecial;

    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma senha. Senha inválida. A senha deve ter no\n" +
                "mínimo 8 caracteres, conter uma letra maiúscula, uma minúscula, um\n" +
                "número e um caractere especial");
        String senha = scan.nextLine();




    }
}
