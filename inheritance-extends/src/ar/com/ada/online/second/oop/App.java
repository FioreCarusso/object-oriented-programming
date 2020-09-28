package ar.com.ada.online.second.oop;

import ar.com.ada.online.second.oop.zoo.Dog;
import ar.com.ada.online.second.oop.zoo.Horse;

public class App {

    public static void main(String[] args) {
        Dog dog1 = new Dog("Golden Retriever" , 4 ,5);
        Dog dog2 = new Dog("Pitbull" , 4,2);
        Horse horse1 = new Horse("Arabe" , "Pegasus" , 60);
        Horse horse2 = new Horse("Belga" , "Rocinante",50 );

        System.out.printf("HashCode de animales\n" +
                "Perro 1:%d \n" +
                "Perro 2: %d\n" +
                "Caballo 1 %d:\n" +
                "Caballo 2: %d\n \n" ,  dog1.hashCode() , dog2.hashCode() , horse1.hashCode(), horse2.hashCode());


        System.out.println(dog1.toString());
        System.out.println(dog2.toString());
        System.out.println();
        System.out.println(horse1.toString());
        System.out.println(horse2.toString());
        System.out.println();
        System.out.println("Los perros son iguales?" + dog1.equals(dog2));
        System.out.println("Los caballos son iguales?" + horse1.equals(horse2));
    }

}
