package ar.com.ada.online.second.herencia.figuras;

import java.util.Objects;

public class Circulo extends Figura {

    double pi = 3.14;
    private Double radio;

    public Circulo(Double radio) {
        this.radio = radio;
    }


    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    @Override
    public double calculoArea() {
        return area = pi * radio * radio;
    }

    @Override
    public int hashCode() {
        return -10 * Objects.hash(this.radio, this.area);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        Circulo that = (Circulo) obj;
        return this.radio.equals(that.radio) &&
                this.area.equals(that.area);
    }

    @Override
    public String toString() {
        return String.format("Circulo = { Radio %1.2f , Area %1.2f }"
                , this.radio, this.area);
    }
}

