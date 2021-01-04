/**
 * Divisao
 */
public class Divisao implements OperacaoMatematica {

    @Override
    public double calcula(double a, double b) {
        if (b > 0) {
            return a / b;
        } else {
            System.out.println("Não é possível dividir um número por zero");
            return 0;
        }
    }
}