package app;

public class Caneta {
    String modelo;
    String cor;
    double ponta;
    int carga;
    boolean tampada;

    void status() {
        System.out.println("Cor: " + this.cor);
        System.out.println("Está tampada?" + this.tampada);
    }

    void rabiscar() {
        if (this.tampada == true) {
            System.out.println("Não é possível rabiscar ela está tampada");
        } else {
            System.out.println("Rabiscando...");

        }
    }

    void tampar() {
        System.out.println("Tampando a caneta...");
        tampada = true;
    }

    void destampar() {
        System.out.println("Destampando a caneta...");
        tampada = false;
    }
}