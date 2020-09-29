package ar.com.ada.online.second;

import ar.com.ada.online.second.subclass.ElectricalVehicle;
import ar.com.ada.online.second.subclass.SportsVehicle;
import ar.com.ada.online.second.subclass.Truck;
import ar.com.ada.online.second.superclass.Vehicle;

public class App {

    public static void main(String[] args) {

        Vehicle[] array = new Vehicle[12];

        array[0] = new ElectricalVehicle("Honda" , "Civic" ,2005 ,190);
        array[1] = new ElectricalVehicle("Renault" , "Sandero" ,2015 ,310);
        array[2] = new ElectricalVehicle("Corven" , "Mirage" ,2020 ,49);

        array[3] = new SportsVehicle("Ferrari", "Berlinetta", 2018, 50);
        array[4] = new SportsVehicle("Nissan" , "GTR" ,2008 ,250);
        array[5] = new SportsVehicle("Lamborghini" , "Aventator" ,2019 ,480);

        array[6] = new Truck("Scania" , "A-150" ,2010 ,40);
        array[7] = new Truck("Iveco" , "B-110" ,2020 ,150);
        array[8] = new Truck("Mercedes Benz" , "C-115" ,2015 ,50);

        array[9] = new Vehicle("Avion Boeing " , "A-320" ,2020 );
        array[10] = new Vehicle("Bicicleta Trek" , "1.2" ,2010 );
        array[11] = new Vehicle("Peugeot" , "206" ,2014 );

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i].technicalSheet());



        }





    }
}
