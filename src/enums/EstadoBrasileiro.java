package enums;

public enum EstadoBrasileiro {
    PI ("Piaui", "PI"),
    MA ("Maranhão", "MA"),
    SP ("São Paulo", "SP"),
    RJ ("Rio de Janeiro", "RJ"),
    CE ("Ceara", "CE");

    private String nome;
    private String sigla;

    private EstadoBrasileiro (String nome,  String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }
}
