package ar.com.ada.online.second.accessibility.acces.modifiers;

public class Bank {

    private Integer numberAcount;
    private String amount;

    private void showAttributesValues(){
        System.out.printf("Los atributos de la clase Bank son:\nNumero de cuenta: %s\nCantidad de dinero: %s" , numberAcount
                , amount);
    }
}
