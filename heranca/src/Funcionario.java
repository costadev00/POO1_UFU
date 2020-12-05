/**
 * Funcionario
 */
public class Funcionario extends Pessoa {
    public Funcionario(final String nome, final int idade, final String sexo) {
        super(nome, idade, sexo);
        // TODO Auto-generated constructor stub
    }

    private String setor;
    private boolean trabalhando;

    public void mudaTrabalho() {
        this.trabalhando = !this.trabalhando;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(final String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(final boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
}