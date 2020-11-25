public class Tv {
    private String marca;
    private String modelo;
    private int tamanho;
    private boolean ligado;
    private boolean aumentar;

    public void cadastrarTv(String marca, String modelo, int tamanho, boolean ligado, boolean aumentar) {
        this.marca = marca;
        this.modelo = modelo;
        this.tamanho = tamanho;
        this.ligado = ligado;
        this.aumentar = aumentar;
    }

    public void status() {
        System.out.println("A marca da tv é: " + this.marca);
        System.out.println("O modelo da tv é: " + this.modelo);
        System.out.println("O tamanho dela é: " + this.tamanho);
        if (this.ligado) {
            System.out.println("A tv esta ligada");

        } else {
            System.out.println("A tv esta desligada");

        }
        if (this.aumentar) {
            System.out.println("O volume esta sendo aumentado");
        } else {
            System.out.println("O volume nao esta sendo aumentado");
        }
    }

    public void LigarTv(boolean ligado) {
        if (this.ligado) {
            System.out.println("A tv esta ligada!!!");
        } else {
            System.out.println("A tv esta desligada");
        }
    }

    public void AumentarTv(boolean aumentar) {
        if (this.aumentar) {
            System.out.println("O volume foi aumentado");
        } else {
            System.out.println("O volume foi abaixado");
        }
    }
}