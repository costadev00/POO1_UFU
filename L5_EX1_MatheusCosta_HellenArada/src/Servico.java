/**
 * Servico
 */
public class Servico implements Classificavel {
    float preco;

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    @Override
    public boolean eMenorQue(Classificavel obj) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void print(Classificavel obj) {
        System.out.println(this.obj);

    }
}