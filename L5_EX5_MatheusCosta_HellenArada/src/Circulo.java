/**
 * Circulo
 */
public class Circulo implements FormaGeometrica {

    float raio;

    public Circulo(float raio) {
        this.raio = raio;
    }

    @Override
    public float area() {
        float res = pi * (raio * raio);
        return res;
    }

    @Override
    public float perimetro() {
        float res = 2 * pi * raio;
        return res;
    }

}
