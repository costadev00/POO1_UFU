public class App {
    public static void main(String[] args) throws Exception {
        Soma s = new Soma();
        System.out.println(s.calcula(2, 2));

        Subtracao sm = new Subtracao();
        System.out.println(sm.calcula(2, 2));

        Multiplicacao m = new Multiplicacao();
        System.out.println(m.calcula(2, 2));

        Divisao d = new Divisao();
        System.out.println(d.calcula(2, 2));
        System.out.println(d.calcula(2, 0));

    }
}
