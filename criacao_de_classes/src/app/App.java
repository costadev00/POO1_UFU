package app;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello Java");
        Caneta c1 = new Caneta();
        c1.modelo = "Bic";
        c1.cor = "Azul";
        c1.ponta = 0.5;
        c1.carga = 100;
        c1.tampada = false;
        Caneta c2 = new Caneta();
        c2.cor = "Vermelha";
        c1.tampar();
        c1.status();
        c1.destampar();
        c1.status();
        c1.rabiscar();
        c1.tampar();
        c1.rabiscar();
    }
}