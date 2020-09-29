package ar.com.ada.online.second.subclass;

import ar.com.ada.online.second.superclass.Vehicle;

import java.util.Objects;

public class ElectricalVehicle extends Vehicle {

    private Integer potency;

    public ElectricalVehicle() {
    }

    public ElectricalVehicle(Integer potency) {
        this.potency = potency;
    }

    public ElectricalVehicle(String brand, String model, Integer year, Integer potency) {
        super(brand, model, year);
        this.potency = potency;
    }

    public Integer getPotency() {
        return potency;
    }

    public void setPotency(Integer potency) {
        this.potency = potency;
    }

    @Override
    public String technicalSheet() {
        if (this.year < 2007) {
            return "No existe modelo para este año\n";
        } else {
            return String.format("\nFICHA TECNICA\nMarca: %s\nModelo: %s\nAnio: %d\nPotencia: %d\n" +
                            "Es un vehiculo de ultima tecnologia!",
                    this.brand,
                    this.model,
                    this.year,
                    this.potency);
        }
    }

    @Override
    public int hashCode() {
        return -10 * Objects.hash(this.brand, this.model, this.year, this.potency);
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        ElectricalVehicle that = (ElectricalVehicle) obj;
        return brand.equals(that.brand)
                && model.equals(that.model)
                && year.equals(that.year)
                && potency.equals(that.potency);

    }

    @Override
    public String toString() {
        return String.format("ElectricalVehicle { brand: %s, model: %s, year: %d, potency %d\n }"
                , this.brand, this.model, this.year, this.potency
        );
    }
}
