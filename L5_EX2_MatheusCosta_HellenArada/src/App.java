public class App {
    public static void main(String[] args) throws Exception {
        // vetor de objetos de forma circular, fazendo a impressao da area e do
        // perimetro como determinados na interface
        Circulo c[] = new Circulo[3];
        c[0] = new Circulo(5);
        c[1] = new Circulo(6);
        c[2] = new Circulo(7);
        System.out.println(c[0].area());
        System.out.println(c[0].perimetro());
        System.out.println(c[1].area());
        System.out.println(c[1].perimetro());
        System.out.println(c[2].area());
        System.out.println(c[2].perimetro());

        // vetor de retangulos e suas devidas implementacoes
        Retangulo r[] = new Retangulo[3];

        r[0] = new Retangulo(5, 3);
        r[1] = new Retangulo(45, 8);
        r[2] = new Retangulo(5, 5);
        System.out.println(r[0].area());
        System.out.println(r[0].perimetro());
        System.out.println(r[1].area());
        System.out.println(r[1].perimetro());
        System.out.println(r[2].area());
        System.out.println(r[2].perimetro());

        Quadrado q[] = new Quadrado[3];

        q[0] = new Quadrado(5);
        q[1] = new Quadrado(8);
        q[2] = new Quadrado(3);
        System.out.println(q[0].area());
        System.out.println(q[0].perimetro());
        System.out.println(q[1].area());
        System.out.println(q[1].perimetro());
        System.out.println(q[2].area());
        System.out.println(q[2].perimetro());

    }
}
