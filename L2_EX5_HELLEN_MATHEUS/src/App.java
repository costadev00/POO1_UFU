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
        t[0].setMarca(marca);
        modelo = ler.nextLine();
        t[0].setModelo(modelo);
        tamanho = ler.nextInt();
        t[0].setTamanho(tamanho);
        ligado = ler.nextBoolean();
        t[0].setLigado(ligado);
        t[0].getLigado();
        aumentar = ler.nextBoolean();

        t[0].setAumentar(aumentar);
        t[0].cadastrarTv(marca, modelo, tamanho, ligado, aumentar);
        t[1].cadastrarTv(marca, modelo, tamanho, ligado, aumentar);
        t[2].cadastrarTv(marca, modelo, tamanho, ligado, aumentar);
        t[0].LigarTv(ligado);
        t[2].AumentarTv(aumentar);
    }
}
