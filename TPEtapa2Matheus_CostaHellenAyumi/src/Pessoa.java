public class Pessoa {

    private String cpf;
    private String nome;
    private String cargo;

    public void Cadastro(String cpf, String nome, String cargo) {
        this.cpf = cpf;
        this.nome = nome;
        this.cargo = cargo;
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
        System.out.println("\nNome: " + this.nome);
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

}
