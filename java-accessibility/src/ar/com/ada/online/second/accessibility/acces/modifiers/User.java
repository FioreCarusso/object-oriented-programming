package ar.com.ada.online.second.accessibility.acces.modifiers;


import ar.com.ada.online.second.accessibility.App;

public class User {

    protected String nickName;
    protected String password;

    protected void showAttributesValues() {
        System.out.printf("Los atributos de la clase User son:\nNombre de usuario: %s\nContrasenia: %s" , nickName
        , password);

    }
}
