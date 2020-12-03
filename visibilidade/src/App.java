public class App {
    public static void main(String[] args) throws Exception {
        Caneta c1 = new Caneta();
        c1.modelo = "Bic Cristal";
        c1.cor = "Azul";
        // c1.ponta = 0.5; Não podemos acessar esse atributo pois ele é privado
        c1.carga = 80;
        c1.rabiscar();
        c1.tampar();
        c1.status();
    }

}
