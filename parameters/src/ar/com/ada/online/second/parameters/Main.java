package ar.com.ada.online.second.parameters;

import java.sql.PreparedStatement;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {

        //instancio las clases

        Result resultado = new Result();
        Arithmetic operacion = new Arithmetic();



        //pide datos al usuario
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese el valor de A");
        double a = scan.nextDouble();

        System.out.println("Ingrese el valor de B");
        double b = scan.nextDouble();

        //ejecucion de metodos y muestra de resultados
        Arithmetic.subtraction(a , b , resultado);
        Arithmetic.sum(resultado, a, b);
        Arithmetic.multiplication(resultado, a, b);
        Arithmetic.division(resultado, a, b);




















    }
}
