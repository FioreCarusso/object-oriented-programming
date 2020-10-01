package ar.com.ada.online.second.herencia.figuras;

import java.util.Objects;

public class Triangulo extends Figura {

    private Double base;
    private Double altura;

    public Triangulo(Double base, Double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calculoArea() {
        area = this.base * this.altura / 2;
        return this.area;
    }

    @Override
    public int hashCode() {
        return -5 * Objects.hash(this.base, this.altura, this.area);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        Triangulo that = (Triangulo) obj;
        return this.base.equals(that.base) &&
                this.altura.equals(that.altura) &&
                this.area.equals(that.area);
    }

    @Override
    public String toString() {
        return String.format("Triangulo = {Base %1.2f , Altura %1.2f , Area %1.2f }",
                this.base, this.altura, this.area);
    }
}
