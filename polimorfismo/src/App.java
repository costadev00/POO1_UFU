public class App {
    public static void main(String[] args) throws Exception {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        Cobra j = new Cobra();
        Tartatura t = new Tartatura();
        Goldfish g = new Goldfish();
        Arara e = new Arara();
        m.setPeso(35.3f);
        m.setCorPelo("Marrom");
        m.alimentar();
        m.locomover();
        m.emitirSom();
        // o conceito de polimorfismo é usarmos os mesmos métodos para gerarmos
        // resultados diferentes
        p.locomover();
        c.locomover(5);
        k.locomover();
    }
}
