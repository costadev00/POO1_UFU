/**
 * Professor
 */
public class Professor extends Pessoa {

    private float salario;
    private String especialidade;

    public Professor(String nome, int idade, String sexo, float salario, String especialidade) {
        super(nome, idade, sexo);
        this.salario = salario;
        this.especialidade = especialidade;
    }

    public void receberAumento(float aumento) {
        salario += aumento;
    }

}