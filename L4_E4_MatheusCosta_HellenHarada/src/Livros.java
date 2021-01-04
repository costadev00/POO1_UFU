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

    public void deletar(int codigo) {
        this.codigo = (Integer) null;
        this.descLivro = null;
        this.ISBN = null;

    }

    public Livros() {
    }

    @Override
    public String toString() {
        return "Livros [ISBN=" + ISBN + ", codigo=" + codigo + ", descLivro=" + descLivro + ", editora=" + editora
                + "]";
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescLivro() {
        return descLivro;
    }

    public void setDescLivro(String descLivro) {
        this.descLivro = descLivro;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String iSBN) {
        ISBN = iSBN;
    }

    public Editoras getEditora() {
        return editora;
    }

    public void setEditora(Editoras editora) {
        this.editora = editora;
    }
}
