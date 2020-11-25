public class Funcionario {
	private String nome;
	private float salario;
	private String cpf;

	public void cadastrarFuncionario(String nome, float salario, String cpf) {
		this.nome = nome;
		this.salario = salario;
		this.cpf = cpf;
	}

	public float getSalario() {
		return salario;
	}

	public String setNome(String nome) {
		this.nome = nome;
		return nome;
	}

	public String setCpf(String cpf) {
		this.cpf = cpf;
		return cpf;
	}

	public float setSalario(float salario) {
		this.salario = salario;
		return salario;
	}
}