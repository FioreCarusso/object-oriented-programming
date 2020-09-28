package ar.com.ada.online.second.obj;

import ar.com.ada.online.second.obj.override.Person;

public class App {

    public static void main(String[] args) {


        Person persona1 = new Person("Maria");
        Person persona2 = new Person("Juana", "Vasquez");
        Person persona3 = new Person("Franco" , "Rodriguez");
        Person persona4 = new Person("Franco", "Rodriguez");

        System.out.println(persona1.toString() + persona2.toString()
        + persona3 + persona4);


        System.out.printf("HashCodes de las personas\n"+
                "Persona 1: %d\n"+
                "Persona 2: %d\n"+
                "Persona 3: %d\n"+
                "Persona 4: %d\n",persona1.hashCode(),persona2.hashCode(),persona3.hashCode(),persona4.hashCode());

        System.out.println();
        System.out.printf("Maria = Juana?: %s\n" , persona1.equals(persona2));
        System.out.printf("Maria = Franco(1)?: %s\n" , persona1.equals(persona3));
        System.out.printf("Maria = Franco(2)? %s\n" , persona1.equals(persona4));
        System.out.printf("Juana = Franco(1)? %s\n" , persona2.equals(persona3));
        System.out.printf("Juana = Franco(2)? %s\n" , persona2.equals(persona4));
        System.out.printf("Franco(1) = Franco(2)? %s\n" , persona3.equals(persona4));


    }






}
