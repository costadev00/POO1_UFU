class Complexo {
    // parte real e complexo, respectivamnte
    private double a, b;

    public Complexo() {
        a = 0;
        b = 0;
    }

    public Complexo(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double Re() {
        // retorna a parte real
        return a;
    }

    public double Im() {
        // retorna a parte imaginaria
        return b;
    }

    public void exibirComplexo(Complexo c) {
        // a = a * c.a - b * c.b;
        // b = a * c.b + b * c.a;
        System.out.println("(" + a + " + " + b + "i)");
    }

    public void valorAbsoluto(Complexo c) {
        Complexo resultado = new Complexo();
        a = a * c.a - b * c.b;
        b = a * c.b + b * c.a;
        double res = a + b;
        System.out.println(Math.abs(res));
    }

    public void complexoConjugado(Complexo c) {
        Complexo resultado = new Complexo();
        a = a * c.a - b * c.b;
        b = a * c.b + b * c.a;
        double res = a - b;
        System.out.println(res + "i");
    }

    public void somaComplexos(Complexo c) {
        Complexo resultado = new Complexo();
        a = a * c.a - b * c.b;
        b = a * c.b + b * c.a;
        double res = a + b;
        System.out.println(res);
    }

    public void produtoComplexos(Complexo c) {
        Complexo resultado = new Complexo();
        a = a * c.a - b * c.b;
        b = a * c.b + b * c.a;
        double res = a * b;
        System.out.println(res);
    }

}