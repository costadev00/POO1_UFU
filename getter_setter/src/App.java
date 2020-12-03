public class App {
    public static void main(String[] args) throws Exception {
        Caneta c1 = new Caneta("Bic", "Amarelo", 0.4f);
        c1.setModelo("Bic");
        c1.setPonta(0.5f);
        c1.status();
        System.out.println("Modelo " + c1.getModelo());

    }

}
