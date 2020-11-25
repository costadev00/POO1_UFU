public class Livros {
    private int codigo;
    private String descLivro;
    private String ISBN;
    Editoras editora;

    public void cadastrar(int codigo, String descLivro, String ISBN) {
        this.codigo = codigo;
        this.descLivro = descLivro;
        this.ISBN = ISBN;
    }

    public void imprime(int codigo, String descLivro, String ISBN) {
        this.codigo = codigo;
        this.descLivro = descLivro;
        this.ISBN = ISBN;
        System.out.println("Codigo = " + this.codigo);
        System.out.println("DescLivro = " + this.descLivro);
        System.out.println("ISBN = " + this.ISBN);

    }
}
