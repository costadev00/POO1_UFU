import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int n, r, result = 0;
        Scanner ler = new Scanner(System.in);
        n = ler.nextInt();
        r = ler.nextInt();
        System.out.println("" + n);
        result = n;
        for (int i = 1; i < 20; i++) {
            result = result + r;
            System.out.println(result);
        }
    }
}
