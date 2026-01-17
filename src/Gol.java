public class Gol implements Carro {

    @Override
    public void acelerar() {
        System.out.println("Gol acelerado");
    }

    @Override
    public void freiar() {
        System.out.println("Gol freiar");
    }

    @Override
    public void parar() {
        System.out.println("Gol parar");
    }
}
