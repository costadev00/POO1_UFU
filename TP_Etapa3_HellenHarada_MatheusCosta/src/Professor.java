public class Professor extends Pessoa {

    private String areaatuacao;
    private int quantmatministrada;
    private double salario;

    public void Cadastro(String cpf, String nome, String areaatuacao, int quantmatministrada, double salario) {
        super.Cadastro(cpf, nome);
        this.areaatuacao = areaatuacao;
        this.quantmatministrada = quantmatministrada;
        this.salario = salario;
    }

    public String getAreaatuacao() {
        return areaatuacao;
    }

    public void setAreaatuacao(String areaatuacao) {
        this.areaatuacao = areaatuacao;
    }

    public int getQuantmatministrada() {
        return quantmatministrada;
    }

    public void setQuantmatministrada(int quantmatministrada) {
        this.quantmatministrada = quantmatministrada;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Area de atuacao: " + this.areaatuacao);
        System.out.println("Quantidade materias ministradas: " + this.quantmatministrada);
        System.out.println("Salario: " + this.salario);
    }
}
