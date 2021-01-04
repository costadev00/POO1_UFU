import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        // ArrayList de objetos de forma circular, fazendo a impressao da area e do
        // perimetro como determinados na interface
        ArrayList<Circulo> circulos;
        circulos = new ArrayList<Circulo>();
        Circulo c1 = new Circulo(5);
        Circulo c2 = new Circulo(5);
        Circulo c3 = new Circulo(5);
        // Circulo c = new Circulo();

        // Circulo c[] = new Circulo[3];
        System.out.println(c1.area());
        System.out.println(c1.perimetro());
        System.out.println(c2.area());
        System.out.println(c2.perimetro());
        System.out.println(c3.area());
        System.out.println(c3.perimetro());

        // ArrayList de retangulos e suas devidas implementacoes
        ArrayList<Retangulo> retangulos;
        retangulos = new ArrayList<Retangulo>();
        Retangulo r1 = new Retangulo(5, 3);
        Retangulo r2 = new Retangulo(45, 8);
        Retangulo r3 = new Retangulo(5, 5);

        System.out.println(r1.area());
        System.out.println(r1.perimetro());
        System.out.println(r2.area());
        System.out.println(r2.perimetro());
        System.out.println(r3.area());
        System.out.println(r3.perimetro());

        // ArrayList de quadrados e suas devidas implementacoes
        ArrayList<Quadrado> quadrados;
        quadrados = new ArrayList<Quadrado>();
        Quadrado q1 = new Quadrado(5);
        Quadrado q2 = new Quadrado(8);
        Quadrado q3 = new Quadrado(3);

        System.out.println(q1.area());
        System.out.println(q1.perimetro());
        System.out.println(q2.area());
        System.out.println(q2.perimetro());
        System.out.println(q3.area());
        System.out.println(q3.perimetro());

    }
}
