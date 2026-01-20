import com.andre.veiculo.Carrinho;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Inferencia
        var nomeVariavel = "Luis";

        // numeros inteiros
        byte bits8 = 127; // -128 ~ 127
        short bits16 = 32767; // -32.768 a 32.767
        int bits32 = 2147483647; // -2147483648 a 2147483647
        long bits64 = 9223372036854775807L; // -9223372036854775808 a 9223372036854775807

        // numeros decimais
        float bits32Float = 3.14f; // precisão simples
        double bits64Double = 3.14; // precisão dupla

        // caracters, palavras, frases
        char unicoCaractere = 'a'; // aspas simples
        String meuNome = "Luís Andre"; // aspas duplas

        // boolean
        boolean isDev = false;

        // Condicionis
        if (meuNome.isBlank()) {
            isDev = true;
            System.out.println(isDev);
        } else if (false) {
            System.out.println("não sou eu");
        } else {
            System.out.println("Deu Bom");
        }

        // vetor
        int[] colecaoDeInteiros = {1,2,3,4,5};
        int[] colecaoDeInteiros2 = new int[30];

        for (int i = 0; i < colecaoDeInteiros.length; i++) {
            System.out.println(colecaoDeInteiros[i]);
        }

        // ArrayList
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add(nomeVariavel);
        nomes.add("Maria");
        nomes.add("Rodrigues");
        nomes.add("Ticia");
        System.out.println(nomes);
        System.out.println(nomes.get(3));
        System.out.println(nomes.contains("Maria"));
        System.out.println(nomes.remove("Rodrigues"));
        System.out.println(nomes);

        for (String nome : nomes) {
            System.out.println(nome);
        }

        //Casting explicito
        double resultado = 0.0;
        int resultadoInt = (int) resultado;

        //Casting implicito
        int meuInt = 10;
        double meuDouble = meuInt;

        //Casting explicito
        String meuString = "10";
        int meuInt2 = Integer.parseInt(meuString);

        String minhaString = String.valueOf(meuInt2);

        //Executando no terminal
        // javac Main.java - compila
        // java Main - executa oq foi compilado

        SerVivo humano = new Humano();

        System.out.println(humano.idade + " anos");
        humano.respirar();

        Carrinho gol = new Carrinho("gol", "preto", 97, "12345678");
        System.out.println(gol.toString());

        List<String> listaNomes = new ArrayList<>();
        listaNomes.add("Fernanda autista");
        listaNomes.add("Pedro");
        listaNomes.add("Fernanda tdah");
        listaNomes.add("Antonio");
        listaNomes.add("Fernanda esuizofrenica");
        System.out.println("Nomes: " + listaNomes);

        Set<String> fernandas = listaNomes
                .stream()
                .filter(n -> n.startsWith("Fernanda"))
                .map(n -> n.replace(" ", ""))
                .map(String::toUpperCase)
                        .collect(Collectors.toSet());
        System.out.println("Fernandas: " + fernandas);


    }
}