package ar.com.ada.online.second.objectsexercisetwo;

import java.util.Date;

public class Item {

    //atributos de la clase

    String name;
    Double price;
    Double tax;
    Date expirationDate;
    Double total;

    //cree el objeto ahora de clase Date --> por si mismo representa la fecha actual (25/08/2020)
    Date ahora = new Date();

    //metodos de la clase

    Double calculateTax() {
        tax = price * 0.21;               //fije el impuesto iva de 21%
        return tax;                       // va a retornar el valor impuesto
    }


    Double getTotalToPay() {
        total = tax + price;              //metodo que va a calcular el total = precio+impuesto
        return total;                     //devuelve el valor total
    }


    Boolean canItBeSold(boolean b) {
        if (ahora.compareTo(expirationDate) > 0) {
            System.out.println("Item no habilitato para la venta");
            return false;
        } else {
            System.out.println(expirationDate);
        }
        return true;
    }
}