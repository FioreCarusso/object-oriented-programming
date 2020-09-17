package ar.com.ada.online.second.accessibility;

import ar.com.ada.online.second.accessibility.acces.modifiers.Person;
import ar.com.ada.online.second.accessibility.acces.modifiers.User;

public class App {

    public static void main(String[] args) {

        Person person = new Person();
        User user = new User();       //no accederemos a lo atributos de esta clase porque son de tipo protected

        person.name = "Maria";
        person.lastName = "Fernandez";
        person.age = 23;

        person.showAttributeValues();















    }
}
