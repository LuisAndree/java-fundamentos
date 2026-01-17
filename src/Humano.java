public class Humano extends SerVivo {
    public Humano() {
        super(28);
    }

    @Override
    public void respirar() {
        System.out.println(this.idade);
        System.out.println("Humano respirando...");
    }

}
