package ar.com.ada.online.second.obj;

import java.util.Objects;

public class NaveStarWars {

    private String model;
    private Integer maximaVelocidad;

    public NaveStarWars() {

    }

    public NaveStarWars(String model) {
        this.model = model;


    }

    public NaveStarWars(Integer maximaVelocidad) {
        this.maximaVelocidad = maximaVelocidad;

    }

    public NaveStarWars(String model, Integer maximaVelocidad) {
        this.model = model;
        this.maximaVelocidad = maximaVelocidad;

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getMaximaVelocidad() {
        return maximaVelocidad;
    }

    public void setMaximaVelocidad(Integer maximaVelocidad) {
        this.maximaVelocidad = maximaVelocidad;
    }

    //redefinicion del metodo toString()
    @Override
    public String toString() {
        return String.format(
                "NaveStarWars { model = %s , maximaVelocidad = %d }"
                , this.model, this.maximaVelocidad);
    }

    //metodo hash redefinido para que devuelva un hash de los atributos y no del espacio de memoria
    @Override
    public int hashCode() {
        return -10 * Objects.hash(this.model , this.maximaVelocidad);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)  return true;    //comparamos referencias
        if ((obj == null) || this.getClass() != obj.getClass()) return false; //comparamos si es nulo
                                                                              //comparamos si son de la misma clase
        NaveStarWars that = (NaveStarWars) obj;                               //casteamos a obj de clase NAVE
        return this.model.equals(that.model) && this.maximaVelocidad.equals(that.maximaVelocidad);
    }
}
