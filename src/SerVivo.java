public abstract class SerVivo {

    protected int idade;

    public SerVivo(int idade) {
        this.idade = idade;
    }

    public abstract void respirar();

    public void durmir() {
        System.out.println("SerVivo durmiu");
    }
}
