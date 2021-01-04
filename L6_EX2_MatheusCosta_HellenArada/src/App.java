import java.util.*;

public class App {

    public static void main(String[] args) throws ExceptionC {

        int idade;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a idade:");
        idade = ler.nextInt();

        try {
            if (idade > 50) {
                throw new ExceptionA("A idade é invalida");
            }
        } catch (ExceptionB e) {
            System.out.println("Erro:" + e.getMessage());
        } finally {
            System.out.println("Fim do programa");
        }
    }
}
