package ar.com.ada.online.second.obj.override;

import java.util.Objects;

public class Person {
    private String name;
    private String lastName;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public int hashCode() {
        return -20 * Objects.hash(this.name , this.lastName);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        Person that = (Person) obj;
        return this.name.equals(that.name) && this.lastName.equals(that.lastName);
    }

    @Override
    public String toString() {
        return String.format("Nombre de la persona: %s , Apellido de la persona: %s\n" ,
                this.name , this.lastName);
    }
}
