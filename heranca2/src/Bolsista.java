/**
 * Bolsista
 */
public final class Bolsista extends Aluno {

    private float bolsa;

    public Bolsista(String nome, int idade, String sexo, int matricula, String curso, float bolsa) {
        super(nome, idade, sexo, matricula, curso);
        this.bolsa = bolsa;
    }

    public void renovarBolsa() {
        System.out.println("Renovando bolsa...");
    }

    @Override
    final public void pagarMensalidade() {
        System.out.println("Pagando mensalidade do bolsista...");

    }

    // @Override
    // public String toString() {
    // return "Bolsista [bolsa=" + bolsa + "]";
    // }

}