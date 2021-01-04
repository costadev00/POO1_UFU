/**
 * Racional
 */
public class Racional {

    private int p, q;

    public Racional(int p, int q) {
        if (q == 0) {
            this.q = 1;
        } else {
            this.q = q;
        }
        this.p = p;

    }

    public Racional() {
        this.p = 0;
        this.q = 1;
    }

    public void exibeRacional() {
        System.out.println(p + "/" + q);
    }

    public void verificaMaiorQue1() {
        double res = p / q;
        if (res > 1) {
            System.out.println("é maior que 1");
        } else {
            System.out.println("Nao é maior que 1");
        }
    }

    public Racional produtoRacionais(Racional x) {
        Racional aux = new Racional();
        aux.p = p * x.p;
        aux.q = p * x.q;
        return aux;
    }
}