package CursoJava.aComplemento.Parte5;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaExemplo {

    //Método para preencher exemplo com 10 contatos
    public static HashMap<String, String> criarContatosExemplo(){
        HashMap<String, String> contatos = new HashMap<>();
        contatos.put("Maria Fernanda", "897545821");
        contatos.put("Eduarda", "90876354");
        contatos.put("João Pedro", "998742136");
        contatos.put("Lucas Silva", "977451236");
        contatos.put("Ana Beatriz", "964512378");
        contatos.put("Pedro Henrique", "981236547");
        contatos.put("Camila Souza", "987456321");
        contatos.put("Rafael Lima", "912345678");
        contatos.put("Juliana Alves", "934567812");
        contatos.put("Gabriel Santos", "956478123");
        return contatos;
    }

    //1 - contar contatos
    public static int contarContatos(Map<String, String> contatos){
        return contatos.size();
    }

    //2 - atualizar telefone de um contato
    public static boolean atualizarTelefone(Map<String, String> contatos, String nome, String novoTelefone){
        if(contatos.containsKey(nome)){
            contatos.put(nome, novoTelefone) ; // put substitui o valor existente
            return true;
        }else {
            return false; //contato não existe
        }
    }

    // 3) listar em ordem alfabética usando TreeMap
    public static void listarEmOrdemAlfabetica(Map<String, String> contatos) {
        // TreeMap ordena as chaves (nomes) naturalmente (alfabética)
        TreeMap<String, String> ordenado = new TreeMap<>(contatos);
        System.out.println("=== Contatos (ordem alfabética) ===");
        for (Map.Entry<String, String> e : ordenado.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }



}
