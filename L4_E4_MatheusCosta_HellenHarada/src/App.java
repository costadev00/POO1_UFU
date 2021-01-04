
//Matheus Costa, Hellen Harada, 22/11/2020
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        int codigo;
        String descLivro;
        String ISBN;
        Editoras editora;

        int razaoSocial;
        String contato;
        String telefone;

        Livros l1 = new Livros();
        System.out.println("Vamos cadastrar um livro");
        codigo = ler.nextInt();
        descLivro = ler.nextLine();
        ISBN = ler.nextLine();
        l1.cadastrar(codigo, descLivro, ISBN);
        l1.imprime(codigo, descLivro, ISBN);
        System.out.println("Deseja deletar um Livro?");

        l1.deletar(codigo);

        Editoras e1 = new Editoras();
        System.out.println("Vamos cadastrar uma editora");
        razaoSocial = ler.nextInt();
        contato = ler.nextLine();
        telefone = ler.nextLine();
        e1.cadastrarEdi(razaoSocial, contato, telefone);
    }

}
