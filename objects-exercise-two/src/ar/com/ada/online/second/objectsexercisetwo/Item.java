package ar.com.ada.online.second.objectsexercisetwo;

import java.util.Date;

public class Item {

    //atributos de la clase

    String name;
    Double price;
    Double tax;
    Date expirationDate;


    //metodos de la clase

    void calculateTax() {
        this.tax = this.price * 0.21;
    }


    Double getTotalToPay() {
        Double result = this.tax + this.price;
        return result;
    }

    //El metodo es necesario para establecer cuando el item puede ser vendido
    //Sera vendido si la fecha de vencimiento es mayor a la fecha actual (si va despues)
    Boolean canItBeSold() {
        Date today = new Date();                           //creo el obj today de tipo Date
        Boolean result = expirationDate.after(today);      //result = fechaVencimiento despues de hoy
        return result;                                     //el valor de retorno del metodo
    }

}