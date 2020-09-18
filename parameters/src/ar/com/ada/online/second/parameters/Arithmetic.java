package ar.com.ada.online.second.parameters;

public class Arithmetic {

//metodos


    public static void sum(Result suma, double a, double b) {  //toma por parametro el objeto Result y los datos primitivos
        double resultado = a + b;                                    //resuelve la operacion pedida
        suma.setResultSum(resultado);                        //objeto.setmetodo(resultado) --> asigna el resultado al atributo del obj mediante setters
        System.out.println("La suma de estos dos numeros es: " + resultado);

    }

    public static void subtraction(double a, double b, Result resta) {
        double resultado = a - b;
        resta.setResultSubtraction(resultado);
        System.out.println("La resta de estos dos numeros es: " + resultado);
    }

    public static void multiplication(Result multiplicacion, double a, double b) {
        double resultado = a * b;
        multiplicacion.setResultMultiplication(resultado);
        System.out.println("La multiplicacion de estos dos numeros es: " + resultado);

    }

    public static void division(Result objDivision, double a, double b) {
        double resultado = a / b;
        objDivision.setResultDivision(resultado);
        System.out.println("La division de estos dos numeros es: " + resultado);


    }

}
