/**
 * VeiculoAutomotor
 */
public abstract class VeiculoAutomotor {

    @Override
    public String toString() {
        return "VeiculoAutomotor [AnoFabricacao=" + AnoFabricacao + ", marca=" + marca + ", modelo=" + modelo
                + ", placa=" + placa + "]";
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAnoFabricacao() {
        return AnoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        AnoFabricacao = anoFabricacao;
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
        if (AnoFabricacao != other.AnoFabricacao)
            return false;
        if (marca == null) {
            if (other.marca != null)
                return false;
        } else if (!marca.equals(other.marca))
            return false;
        if (modelo == null) {
            if (other.modelo != null)
                return false;
        } else if (!modelo.equals(other.modelo))
            return false;
        if (placa == null) {
            if (other.placa != null)
                return false;
        } else if (!placa.equals(other.placa))
            return false;
        return true;
    }
}