package ar.com.ada.online.second.objectsexercisetwo;

import java.util.Date;

public class Item {

    //atributos de la clase

    String name;
    Double price;
    Double tax;
    Date expirationDate;


    //cree el objeto ahora de clase Date --> por si mismo representa la fecha actual
    Date ahora = new Date();

    //metodos de la clase

    Double calculateTax() {
        tax = price * 0.21;               //fije el impuesto iva de 21%
        return tax;                       // va a retornar el valor impuesto
    }


    Double getTotalToPay() {
        return tax + price;              //metodo que va a calcular el total = precio+impuesto
    }


    Boolean canItBeSold(boolean b) {
        if (expirationDate.compareTo(ahora) > 0) {
            return true;
        } else {
            System.out.println("Item no habilitado para la venta");
        }
        return false;
    }
}