package ar.com.ada.online.second.subclass;

import ar.com.ada.online.second.superclass.Vehicle;

import java.util.Objects;

public class Truck extends Vehicle {

    private Integer maxLoad;

    public Truck() {
    }

    public Truck(Integer maxLoad) {
        this.maxLoad = maxLoad;
    }

    public Truck(String brand, String model, Integer year, Integer maxLoad) {
        super(brand, model, year);
        this.maxLoad = maxLoad;
    }

    public Integer getMaxLoad() {
        return maxLoad;
    }

    public void setMaxLoad(Integer maxLoad) {
        this.maxLoad = maxLoad;
    }


    @Override
    public String technicalSheet() {
        if (maxLoad < 100) {
            return String.format("\nFICHA TECNICA\nMarca: %s\nModelo: %s\nAnio: %d\n" +
                            "Para iniciar un negocio de flete, está muy bien este auto",
                    this.brand, this.model, this.year);

        } else if (maxLoad > 101) {
            return String.format("\nFICHA TECNICA\nMarca: %s\nModelo: %s\nAnio: %d\n" +
                            "Tienes que usar este auto en el campo, es una máquina de trabajo!!",
                    this.brand, this.model, this.year);

        }


        return null;
    }

    @Override
    public String toString() {
        return String.format("Truck { brand: %s, model: %s, year: %d, max load: %d\n }"
                , this.brand, this.model, this.year, this.maxLoad
        );


    }

    @Override
    public int hashCode() {
        return -10 * Objects.hash(this.maxLoad);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        Truck that = (Truck) obj;
        return brand.equals(that.brand)
                && model.equals(that.model)
                && year.equals(that.year)
                && maxLoad.equals(that.maxLoad
        );
    }
}
