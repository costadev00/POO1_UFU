/**
 * Produto
 */
public class Produto implements Classificavel {
    private int codigo;

    public Produto(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public boolean eMenorQue(Classificavel o) {
        Produto compara = (Produto) o;
        if (this.codigo < compara.codigo) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void print(Classificavel obj) {
        System.out.println(obj);
    }

}