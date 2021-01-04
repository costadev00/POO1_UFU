/**
 * Retangulo
 */
public class Retangulo implements FormaGeometrica {

    float base;
    float altura;

    public Retangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public float area() {
        float res = (base * altura) * 2;
        return res;
    }

    @Override
    public float perimetro() {
        float res = (base + altura) * 2;
        return res;
    }

}