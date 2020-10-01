package ar.com.ada.online.second.herencia.figuras;

import java.util.Objects;

public abstract class Figura {

    protected Double area;

    public Figura() {

    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    //metodo propio de la clase

    public abstract double calculoArea();

    @Override
    public int hashCode() {
        return -10 * Objects.hash(this.area);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        Figura that = (Figura) obj;
        return this.area.equals(that.area);

    }
}
