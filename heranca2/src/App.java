public class App {
    public static void main(String[] args) throws Exception {
        // Pessoa p1 = new Pessoa(); -- classe abstrata
        Visitante v1 = new Visitante("Juvenal", 25, "M");
        System.out.println(v1.toString());
        Aluno a1 = new Aluno("Matheus", 20, "M", 0001, "Sistemas de Informação");
        System.out.println(a1.toString());
        Bolsista b1 = new Bolsista("Gustavo", 26, "M", 6665, "Medicina", 275);
        System.out.println(b1.toString());
        Professor p1 = new Professor("Ana", 30, "F", 50000, "Computacao");
        System.out.println(p1.toString());

    }
}
