/**
 * Moto
 */
public class Moto extends VeiculoAutomotor {

    private int cilindradas;

    public Moto(String marca, String modelo, String placa, int anoFabricacao, int cilindradas) {
        super(marca, modelo, placa, anoFabricacao);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    @Override
    public String toString() {
        return "Moto " + getMarca() + " Modelo - " + getModelo() + " de placa: " + getPlaca() + " Fabricada no ano de "
                + getAnoFabricacao() + " Com " + getCilindradas() + " de capacidade";
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