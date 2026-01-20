package classesEssenciais.javaTime;

import java.time.LocalDate;
import java.util.*;

public class DatasJava {
    public static void main(String[] args) {
        LocalDate dataAtual = LocalDate.now();
        System.out.println("Data: " + dataAtual);

        LocalDate meuAniversario = LocalDate.of(1997, 11, 23);
        System.out.println("Meu Aniversario: " + meuAniversario);

        String dataString = "2023-03-14";
        LocalDate dataString2 = LocalDate.parse(dataString);
        System.out.println("DataString: " + dataString);

        LocalDate dataString3 = LocalDate.ofEpochDay(20470);
        System.out.println("DataString: " + dataString3);

        //List (Lista): Uma lista ordenada que permite elementos duplicados.
        List<String> nomes = new ArrayList<>();
        nomes.add("Juanito");
        nomes.add("Pedro");
        nomes.add("Maria");
        nomes.add("Antonio");
        nomes.add("André");
        System.out.println("Nomes: " + nomes);

        //Set (Conjunto): Uma estrutura que não permite duplicatas
        // (elementos repetidos).
        // Exemplo de implementação: HashSet (baseado em tabela de dispersão/Hash Table).
        Set<String> setString = new HashSet<>();
        setString.add("Juanito");
        setString.add("Pedro");
        setString.add("Maria");
        setString.add("Maria");

        System.out.println("SetString: " + setString);
        System.out.println("SetString: " + setString.contains("Teste"));

        //Map (Mapa): Estrutura de Chave e Valor
        // (similar a objetos em JS ou dicionários em Python).
        // Exige tipagem tanto para a chave quanto para o valor.
        // Exemplo: HashMap.

        Map<String, String> mapa = new HashMap<>();
        mapa.put("1", "Pedro"); // adiciona
        mapa.put("2", "Juanito");
        mapa.put("3", "Antonio");
        System.out.println("Mapa: " + mapa.get("1"));
        System.out.println("Mapa: " +  mapa.get("ababa") );

        //Queue (Fila): Usada para processamento em ordem
        //(o primeiro que entra é o primeiro a ser processado/removido).
        // Exemplo: LinkedList.

        Queue<String> queue = new LinkedList<>();
        queue.add("Pedro");
        queue.add("Juanito");

        System.out.println(queue.peek());

        System.out.println("Queue: " + queue);
        System.out.println("Queue: " + queue.poll());
        System.out.println("Queue: " + queue.poll());
        System.out.println("Queue: " + queue.poll());
        System.out.println("Queue: " + queue);

        queue.add("Pedro");
        queue.add("Juanito");

        System.out.println("Queue: " + queue);
        //System.out.println("Queue: " + queue.remove()); // O remove lança exeção se nao tiver nada na fila
        //System.out.println("Queue: " + queue.remove());
        //System.out.println("Queue: " + queue.remove());
        System.out.println("Queue: " + queue);

        LinkedList<String> listaLinkada = new LinkedList<>();

        listaLinkada.addFirst("maria");
        listaLinkada.addLast("Marta");
        System.out.println("Lista: " + listaLinkada);

        // Generics
        //Definição: Recurso que permite criar classes, interfaces e métodos que operam sobre tipos parametrizados (indicados por <E>, <T>, etc.).
        //Explicação: Permite a reutilização de código para diferentes
        // tipos de dados, mantendo a segurança de tipo (type safety).
        // Por exemplo, uma List<String> usa Generics para definir que
        // aquela lista só aceita Strings.



    }
}
