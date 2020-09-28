package ar.com.ada.online.second.oop.zoo;

import java.util.Objects;

public class Dog extends Animal {

    private Integer legs;
    private Integer age;

    public Dog(){

    }

    public  Dog (String breed , Integer legs , Integer age){
        super(breed);
        this.age = age;
        this.legs = legs;
    }

    public Integer getLegs() {
        return legs;
    }

    public void setLegs(Integer legs) {
        this.legs = legs;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public int hashCode() {
        return -10 * Objects.hash(this.age , this.legs);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        Dog that = (Dog) obj;
        return this.legs.equals(that) &&
                this.age.equals(that);
    }

    @Override
    public String toString() {
        return String.format("Edad del perro: %d\n" +
                "Raza del perro: %s" , this.age , this.getBreed());
    }
}


