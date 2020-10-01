package ar.com.ada.online.second.herencia.figuras;

import java.util.Objects;

public class Rectangulo extends Figura {
    private Double base;
    private Double altura;

    public Rectangulo(Double base, Double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calculoArea() {
        return area = this.base * this.altura;
    }

    @Override
    public int hashCode() {
        return -5 * Objects.hash(this.base , this.altura , this.area);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        Rectangulo that = (Rectangulo) obj;
        return this.base.equals(that.base) &&
                this.altura.equals(that.altura) &&
                this.area.equals(that.area);
    }

    @Override
    public String toString() {
        return String.format("Rectangulo = { Base %1.2f , Altura %1.2f , Area %1.2f }",
                this.base, this.altura, this.area);    }
}
