
//Matheus Costa, Hellen Harada, 22/11/2020
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        int codigo;
        String titulo;
        Edicoes edicoes;
        int numArtigos;
        int numEdicoes;
        int anosEdicao;
        Edicoes e1 = new Edicoes();
        Revistas r1 = new Revistas();
        System.out.println("Vamos cadastrar um livro");
        codigo = ler.nextInt();
        titulo = ler.nextLine();
        numArtigos = ler.nextInt();
        r1.cadastrar(codigo, titulo, edicoes);

    }

}
