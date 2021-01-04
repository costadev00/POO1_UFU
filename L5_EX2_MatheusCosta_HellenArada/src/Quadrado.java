/**
 * Quadrado
 */
public class Quadrado implements FormaGeometrica {

    float lado;

    public Quadrado(float lado) {
        this.lado = lado;
    }

    @Override
    public float area() {
        float res = lado * lado;
        return res;
    }

    @Override
    public float perimetro() {
        float res = lado * 4;
        return res;
    }
}