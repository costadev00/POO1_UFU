import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        String marca;
        String modelo;
        int tamanho;
        boolean ligado;
        boolean aumentar;
        int opcao;
        // Tv t = new Tv();
        Tv t[] = new Tv[5];
        marca = ler.nextLine();
        modelo = ler.nextLine();
        tamanho = ler.nextInt();
        ligado = ler.nextBoolean();
        aumentar = ler.nextBoolean();
        t[0].cadastrarTv(marca, modelo, tamanho, ligado, aumentar);
        t[1].cadastrarTv(marca, modelo, tamanho, ligado, aumentar);
        t[2].cadastrarTv(marca, modelo, tamanho, ligado, aumentar);
        t[0].LigarTv(ligado);
        t[2].AumentarTv(aumentar);
    }
}
