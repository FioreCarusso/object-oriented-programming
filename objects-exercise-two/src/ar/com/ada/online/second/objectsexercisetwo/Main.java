package ar.com.ada.online.second.objectsexercisetwo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {

        Item item = new Item();

        Scanner scan = new Scanner(System.in);


        System.out.println("Ingrese el nombre del item");
        item.name = scan.next();

        System.out.println("Ingrese el precio");
        item.price = scan.nextDouble();

        System.out.println("Ingrese la fecha de vencimiento en formato dd/MM/yyyy");
        String fechaPedida = scan.next();

        SimpleDateFormat fecha = new SimpleDateFormat("dd/MM/yyyy");
        item.expirationDate = fecha.parse(fechaPedida);


        if (item.canItBeSold(true)) {
            System.out.print("Nombre del item: " + item.name + " \nPrecio: " + item.price + "  \nImpuesto: " + item.calculateTax() + "\nEl total a pagar es: " + item.getTotalToPay());
        } else {
            item.canItBeSold(false);
        }


    }
}
