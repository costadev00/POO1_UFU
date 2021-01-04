public abstract class Pessoa {

    private String cpf;
    private String nome;

    public void Cadastro(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void mostrar() {
        System.out.println("\nCpf: " + this.cpf);
        System.out.println("Nome: " + this.nome);
    }

}
