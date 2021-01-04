/**
 * Onibus
 */
public class Onibus extends VeiculoAutomotor {

    private int numMaxPassageiros;
    private boolean v;

    public Onibus(String marca, String modelo, String placa, int anoFabricacao, int numMaxPassageiros) {
        super(marca, modelo, placa, anoFabricacao);
        v = verificaPas(numMaxPassageiros);
        if (v) {
            this.numMaxPassageiros = numMaxPassageiros;
        } else {
            System.out.println("Numero de passageiros inválido");
        }
    }

    private boolean verificaPas(int numMaxPassageiros2) {
        if (numMaxPassageiros2 > 35 || numMaxPassageiros2 < 5) {
            return false;
        } else {
            return true;
        }
    }

    public int getNumMaxPassageiros() {
        return numMaxPassageiros;
    }

    public void setNumMaxPassageiros(int numMaxPassageiros) {
        this.numMaxPassageiros = numMaxPassageiros;
    }

    @Override
    public String toString() {
        return "Carro " + getMarca() + "Modelo - " + getModelo() + " de placa: " + getPlaca() + " Fabricado no ano de "
                + getAnoFabricacao() + " Com capacidade maxima de " + getNumMaxPassageiros() + " passageiros";
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

    public boolean isV() {
        return v;
    }

    public void setV(boolean v) {
        this.v = v;
    }

}