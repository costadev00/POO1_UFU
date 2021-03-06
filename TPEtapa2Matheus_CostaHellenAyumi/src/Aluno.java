public static class Aluno extends Pessoa {

    public Aluno(String nome, int idade, String sexo) {
        super(nome, idade, sexo);
        // TODO Auto-generated constructor stub
    }

    private String matricula;
    private int quantmaterias;
    private String curso;

    public void Cadastro(String cpf, String nome, String matricula, int quantmaterias, String curso, String cargo) {
        super.Cadastro(cpf, nome, cargo);
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
        System.out.println("\nMatricula: " + this.matricula);
        System.out.println("\nQuantidade de materias matriculadas: " + this.quantmaterias);
        System.out.println("\nCurso: " + this.curso);

    }

}
