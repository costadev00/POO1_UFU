public class App {
    public static void main(String[] args) throws Exception {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1001);
        p1.setDono("Matheus Costa");
        p1.abrirConta("CC");
        p1.depositar(300);
        p1.statusAtual();
    }
}
