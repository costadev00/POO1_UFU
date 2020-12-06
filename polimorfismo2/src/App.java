public class App {
    public static void main(String[] args) throws Exception {
        Mamifero x = new Mamifero();
        x.emitirSom();
        Cachorro c = new Cachorro();
        c.emitirSom();
        c.reagir("Olá");
        c.reagir(true);
        c.reagir(11, 59);
        c.reagir(5, 5.5f);
    }
}
