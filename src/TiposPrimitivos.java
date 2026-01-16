public class TiposPrimitivos {
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
        if ("Luis Andre" == meuNome) {
            isDev = true;
            System.out.println(isDev);
        } else if (false) {
            System.out.println("não sou eu");
        } else {
            System.out.println("Deu Bom");
        }

        // vetor
        int[] colecaoDeInteiros = {1,2,3,4,5};
    }
}
