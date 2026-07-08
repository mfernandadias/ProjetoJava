package CursoJava.nelio.secao11;

public enum Mes {
    JANEIRA("Janeiro"),
    FEVEREIRO("Feveiro"),
    MARCO("Marco"),
    ABRIL("Abril"),
    MAIO("Maio"),
    JUNHO("Junho"),
    JULHO("Julho"),
    AGOSTO("Agosto"),
    SETEMBRO("Setembro"),
    OUTUBRO("Outubro"),
    NOVEMBRO("Novembro"),
    DEZEMBRO("Dezembro");

    private String nome;

    Mes(String nome) {
        this.nome = nome;
    }
}
