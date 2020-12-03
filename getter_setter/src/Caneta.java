public class Caneta {

    // método constrictor
    public Caneta(String modelo, String cor, float ponta) {
        this.tampar();
        this.cor = cor;
        this.ponta = ponta;
        this.modelo = modelo;
    }

    private String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String m) {
        this.modelo = m;
    }

    public float getPonta() {
        return this.ponta;
    }

    public void setPonta(float p) {
        this.ponta = p;
    }

    public void status() {
        System.out.println("Sobre a caneta:");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Cor: " + this.cor);
        System.out.println("A caneta esta tamada? " + this.tampada);

    }

    public void tampar() {
        this.tampada = true;
    }

    public void destampar() {
        this.tampada = false;
    }
}