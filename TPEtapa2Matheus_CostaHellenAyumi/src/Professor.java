public class Professor extends Pessoa {

    private String areaatuacao;
    private int quantmatministrada;
    private double salario;

    public void Cadastro(String cpf, String nome, String areaatuacao, int quantmatministrada, double salario,
            String cargo) {
        super.Cadastro(cpf, nome, cargo);
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
        System.out.println("\nArea de atuacao: " + this.areaatuacao);
        System.out.println("\nQuantidade materias ministradas: " + this.quantmatministrada);
        System.out.println("\nSalario: " + this.salario);
    }
}
