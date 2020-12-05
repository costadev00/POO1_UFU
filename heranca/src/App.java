public class App {
    public static void main(final String[] args) throws Exception {

        final Pessoa p1 = new Pessoa("Alessandro", 40, "Masc");
        final Aluno p2 = new Aluno("Matheus", 20, "Masc");
        final Professor p3 = new Professor("Alessandra", 40, "Fem");
        final Funcionario p4 = new Funcionario("Jureia", 80, "Fem");
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
}
