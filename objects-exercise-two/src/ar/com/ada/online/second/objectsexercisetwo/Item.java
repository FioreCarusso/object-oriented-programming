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


    Boolean canItBeSold(){
        Date today = new Date();
        Boolean result = expirationDate.after(today);
        return result;
    }

}