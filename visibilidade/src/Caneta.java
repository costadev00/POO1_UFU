public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    private boolean tampada;
    protected int carga;

    public void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada?: " + this.tampada);
    }

    public void rabiscar() {
        if (this.tampada == true) {
            System.out.println("Não podemos rabiscar com a caneta tampada");
        } else {
            System.out.println("Rabiscando...");

        }
    }

    public void tampar() {
        this.tampada = true;
        System.out.println("A caneta foi tampada");

    }
}
