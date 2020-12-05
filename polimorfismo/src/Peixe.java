/**
 * Peixe
 */
public class Peixe extends Animal {
    private String corEscama;

    @Override
    public void alimentar() {
        System.out.println("Comer substancias");

    }

    @Override
    public void emitirSom() {
        System.out.println("Som de peixe");

    }

    @Override
    public void locomover() {
        System.out.println("Nadando");

    }

    public void soltarBolhas() {
        System.out.println("Soltando bolhas...");

    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

}