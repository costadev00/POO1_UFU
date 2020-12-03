public class App {
    public static void main(String[] args) throws Exception {
        Lutador l[] = new Lutador[6];
        l[0] = new Lutador("Anderson Silva", "Brasileiro", 30, 1.80f, 78, 5, 6, 7);
        l[1] = new Lutador("Anderson Varejao", "Brasileiro", 50, 1.80f, 90, 2, 3, 2);
        l[2] = new Lutador("Vitor Belfort", "Brasileiro", 30, 1.80f, 75, 5, 6, 7);
        l[3] = new Lutador("Jose Aldo", "Brasileiro", 30, 1.80f, 60, 10, 0, 0);
        l[4] = new Lutador("Maguila", "Brasileiro", 30, 1.80f, 110, 900, 0, 0);
        Luta UEC01 = new Luta();
        UEC01.marcarLuta(l[1], l[4]);
        UEC01.lutar();
        l[4].status();
    }
}
