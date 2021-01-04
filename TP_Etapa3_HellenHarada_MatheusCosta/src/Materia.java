import java.util.List;
import java.util.ArrayList;

public class Materia {

    private Professor prof;
    private List<Aluno> listaAluno;

    public void Cadastro(Aluno aluno) {
        this.listaAluno.add(aluno);
    }

    public Materia() {
        listaAluno = new ArrayList<Aluno>();
    }

    public Materia(Professor prof) {
        this.prof = prof;
        listaAluno = new ArrayList<Aluno>();
    }

    public void mostrar() {
        System.out.println("Professor: " + this.prof.getNome());
        for (Aluno a : listaAluno) {
            System.out.println(a.getMatricula() + " - " + a.getNome());
        }

    }
}
