package CursoJava.aComplemento.Parte5.contatoHashSet;

import java.io.Serializable;

public class Contato  {
    private String nome;
    private String telefone;

    public Contato(String nome, String telefone){
         this.nome = nome != null ? nome.trim() : " ";
        this.telefone = telefone != null ? telefone.trim() : " ";
    }

}
