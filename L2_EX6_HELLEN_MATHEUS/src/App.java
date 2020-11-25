import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        int x, y, opcao;
        Scanner ler = new Scanner(System.in);
        Calculadora c = new Calculadora();
        opcao = ler.nextInt();
        x = ler.nextInt();
        y = ler.nextInt();
        c.setX();
        c.setY();
        switch (opcao) {
            case 1:
                c.soma(x, y);
                break;
            case 2:
                c.mult(x, y);
                break;
            case 3:
                if (x == 0) {
                    System.out.println("Impossivel");
                    break;
                }
                c.div(x, y);
            case 4:
                c.sub(x, y);
            default:
                break;
        }
    }

}
