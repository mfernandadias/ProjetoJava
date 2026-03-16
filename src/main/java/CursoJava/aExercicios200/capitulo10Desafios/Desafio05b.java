package CursoJava.aExercicios200.capitulo10Desafios;

public class Desafio05b {
    /*
    implemente um validador de senha que verifique se a senha
    do usuário atende aos seguintes critérios: no mínimo 8
    caracteres, contém pelo menos um número, uma letra maiúsucla, uma
    letra minúsucula e um caractere especial
     */
    public static void main(String[] args){
        String senha = "Senha@1234";

        if(validarSenha(senha)){
            System.out.println("Senha válida: ");
        }else{
            System.out.println("Senha invalida ");
        }

    }

    public static boolean validarSenha(String senha){
        String regex = "(?=.*[a-z])(?=.*[A-Z])(?=.*\\\\d)(?=.*[@$!%*?&.#_-])[A-Za-z\\\\d@$!%*?&.#_-]{8,}$";
        return senha.matches(regex);

    }
}
