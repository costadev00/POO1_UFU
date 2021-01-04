/**
 * Carro
 */
public class Carro extends VeiculoAutomotor {
    private float litrosPortaMalas;

    public Carro(String marca, String modelo, String placa, int anoFabricacao, float litrosPortaMalas) {
        super(marca, modelo, placa, anoFabricacao);
        this.litrosPortaMalas = litrosPortaMalas;
    }

    public float getLitrosPortaMalas() {
        return litrosPortaMalas;
    }

    public void setLitrosPortaMalas(float litrosPortaMalas) {
        this.litrosPortaMalas = litrosPortaMalas;
    }

    @Override
    public String toString() {
        return "Carro " + getMarca() + "Modelo - " + getModelo() + "de placa: " + getPlaca() + " Fabricado no ano de "
                + getAnoFabricacao() + " Com capacidade de " + getLitrosPortaMalas() + " Litros no porta-malas";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        VeiculoAutomotor other = (VeiculoAutomotor) obj;
        if (getAnoFabricacao() != other.getAnoFabricacao())
            return false;
        if (getMarca() == null) {
            if (other.getMarca() != null)
                return false;
        } else if (!getMarca().equals(other.getMarca()))
            return false;
        if (getModelo() == null) {
            if (other.getModelo() != null)
                return false;
        } else if (!getModelo().equals(other.getModelo()))
            return false;
        return true;
    }

}