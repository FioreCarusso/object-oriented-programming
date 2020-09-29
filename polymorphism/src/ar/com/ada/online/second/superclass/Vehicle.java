package ar.com.ada.online.second.superclass;

import java.util.Objects;

public class Vehicle {

    protected String brand;
    protected String model;
    protected Integer year;

    public Vehicle() {
    }

    public Vehicle(String brand, String model, Integer year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String technicalSheet() {
        return String.format("\nFICHA TECNICA\nMarca: %s\n" +
                "Modelo del vehiculo %s\n" +
                "Anio del vehiculo: %d\n" +
                "Este vehiculo no tiene categoria asignada", getBrand(), getModel(), getYear());
    }

    @Override
    public int hashCode() {
        return -5 * Objects.hash(this.brand, this.model, this.year);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        Vehicle that = (Vehicle) obj;
        return this.brand.equals(that.brand)
                && this.model.equals(that.model)
                && this.year.equals(that.year);

    }

    @Override
    public String toString() {
        return String.format("Vehicle { brand: %s, model: %s, year: %d\n }"
                , this.brand, this.model, this.year
        );
    }
}

