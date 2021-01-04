public class Aluno extends Pessoa {

    private String matricula;
    private int quantmaterias;
    private String curso;

    public void Cadastro(String cpf, String nome, String matricula, int quantmaterias, String curso) {
        super.Cadastro(cpf, nome);
        this.matricula = matricula;
        this.quantmaterias = quantmaterias;
        this.curso = curso;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getQuantmaterias() {
        return quantmaterias;
    }

    public void setQuantmaterias(int quantmaterias) {
        this.quantmaterias = quantmaterias;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Matricula: " + this.matricula);
        System.out.println("Quantidade de materias matriculadas: " + this.quantmaterias);
        System.out.println("Curso: " + this.curso);

    }

}
