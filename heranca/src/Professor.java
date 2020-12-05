/**
 * Professor
 */
public class Professor extends Pessoa {

    public Professor(final String nome, final int idade, final String sexo) {
        super(nome, idade, sexo);
        // TODO Auto-generated constructor stub
    }

    private String especialidade;
    private float salario;

    public void receberAumento(final float aumento) {
        this.salario += aumento;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(final String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(final float salario) {
        this.salario = salario;
    }

}