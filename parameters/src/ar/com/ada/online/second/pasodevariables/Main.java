package ar.com.ada.online.second.pasodevariables;


//ejercicio basico de paso de variables como parametros

public class Main {

    public static void main(String[] args) {
        m1();



    }

//paso de variable de tipo primitivo



    private static void m1() {
        int a = 20;
        System.out.println("A antes de invocar el metodo 'm2': " + a);
        m2(a);
        System.out.println("A despues de invocar el metodo 'm2': " + a);


    }

    private static void m2(int b) {
        System.out.println("B al iniciar el metodo 'm2': " + b);
        boolean c = true;
        b++;
        System.out.println("El nuevo valor de B incrementado: " + b);
    }
}