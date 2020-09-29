package ar.com.ada.online.second.subclass;

import ar.com.ada.online.second.superclass.Vehicle;

import java.sql.SQLOutput;
import java.util.Objects;

public class SportsVehicle extends Vehicle {

    private Integer rpm;

    public SportsVehicle() {

    }

    public SportsVehicle(Integer rpm) {
        this.rpm = rpm;
    }

    public SportsVehicle(String brand, String model, Integer year, Integer rpm) {
        super(brand, model, year);
        this.rpm = rpm;
    }

    public Integer getRpm() {
        return rpm;
    }

    public void setRpm(Integer rpm) {
        this.rpm = rpm;
    }

    @Override
    public String technicalSheet() {
        if (rpm <= 50) {
            return String.format("\nFICHA TECNICA\nMarca: %s\nModelo: %s\nAnio: %d\n" +
                            "El auto es muy bonito, pero solo sirve para salir a pasear",
                    this.brand, this.model, this.year);

        } else if (rpm > 51 && rpm < 300) {
            return String.format("\nFICHA TECNICA\nMarca %s\nModelo: %s\nAnio: %d\n" +
                            "Con este auto puedes desafiar a cualquiera en la "
                    , this.brand, this.model, this.year);

        } else if (rpm > 301 && rpm < 600) {
            return String.format("\nFICHA TECNICA\nMarca %s\nModelo: %s\nAnio: %d\n" +
                            "Si tienes este auto, debe considerar participar en NASCAR",
                    this.brand, this.model, this.year);

        } else if (rpm > 601) {
            return ("FICHA TECNICA\nMarca %s\nModelo: %s\nAnio: %d\n" + "¿Eres parte del elenco de rápidos y furiosos?");

        }
        return null;
    }

    @Override
    public int hashCode() {
        return -10 * Objects.hash(this.brand, this.model, this.year, this.rpm);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        SportsVehicle that = (SportsVehicle) obj;
        return this.brand.equals(that.brand)
                && this.model.equals(that.model)
                && this.year.equals(that.year)
                && this.rpm.equals(that.rpm);

    }

    @Override
    public String toString() {
        return String.format("SportsVehicle { brand: %s, model: %s, year: %d, revolutions %d\n }"
                , this.brand, this.model, this.year, this.rpm
        );
    }
}
