public class App {
    public static void main(String[] args) throws Exception {
        Racional r = new Racional(5, 6);
        Racional r2 = new Racional(1, 2);
        r.exibeRacional();
        r.verificaMaiorQue1();

        r.produtoRacionais(r2).exibeRacional();
    }
}
