public class Revistas {
    private int codigo;
    private String titulo;
    private Edicoes edicoes;

    public void cadastrar(int codigo, String titulo, Edicoes edicoes) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.edicoes = edicoes;
    }
}
