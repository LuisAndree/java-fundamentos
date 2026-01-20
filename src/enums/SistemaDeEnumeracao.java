package enums;

public class SistemaDeEnumeracao {
    public static void main(String[] args) {
        String nomeString = "sao_paulo";

        for(EstadoBrasileiro eb: EstadoBrasileiro.values()) {
            System.out.println(eb.getSigla() + " " + eb.getNome());
        }
    }
}
