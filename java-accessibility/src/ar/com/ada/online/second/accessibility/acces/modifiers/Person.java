package ar.com.ada.online.second.accessibility.acces.modifiers;

public class Person {

    public String name;
    public String lastName;
    public Integer age;


    public void showAttributeValues() {
        System.out.printf("Los atributos de la clase Person son:\nNombre: %s\n" +
                "Apellido: %s\nEdad: %s" , name, lastName, age);

    }
}
