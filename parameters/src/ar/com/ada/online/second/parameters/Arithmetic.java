package ar.com.ada.online.second.parameters;

public class Arithmetic {



    //los metodos toman por parametro los objetos Result y los datos primitivos
    public static void sum(Result suma, double a, double b) {

        //variable que contiene el resultado de la operacion
        double resultado = a + b;
        //seteo los atributos de los objetos, paso por parametro la variable anterior
        suma.setResultSum(resultado);
        //imprimo
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
