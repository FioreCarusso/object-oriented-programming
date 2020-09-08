package ar.com.ada.online.second.objectsexercisetwo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {

        Item item = new Item();
        Scanner scan = new Scanner(System.in);

        //Entrada de datos del usuario

        System.out.println("Ingrese el nombre del item");
        item.name = scan.nextLine();

        System.out.println("Ingrese el precio");
        //item.price = scan.nextDouble();
        item.price = Double.valueOf(scan.next());

        System.out.println("Ingrese la fecha de vencimiento en formato dd/MM/yyyy");
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        item.expirationDate = dateFormat.parse(scan.next());

        item.calculateTax();

        if (item.canItBeSold()) {                            //Si el item puede ser vendido muestra salida de datos
            Double totalToPay = item.getTotalToPay();
            System.out.printf("*Nombre: %s\n*Precio: %.2f\n*Impuesto: %.2f\n*Total a pagar: %.2f",
                    item.name, item.price, item.tax, totalToPay
            );

        } else {
            System.out.println("Item no habilitado para la venta");      //Sino arroja el mensaje
        }


    }
}
