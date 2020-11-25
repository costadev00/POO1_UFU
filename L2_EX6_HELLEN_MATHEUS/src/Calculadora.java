public class Calculadora {
    private int x, y;

    public int setX() {
        this.x = x;
        return x;
    }

    public int setY() {
        this.y = y;
        return y;
    }

    public void soma(int x, int y) {
        System.out.println("A soma eh:" + (x + y));
    }

    public void mult(int x, int y) {
        System.out.println("A multiplicacao eh: " + (x * y));
    }

    public void div(int x, int y) {
        System.out.println("A divisao eh: " + (x / y));
    }

    public void sub(int x, int y) {
        System.out.println("A subtracao eh: " + (x - y));
    }
}