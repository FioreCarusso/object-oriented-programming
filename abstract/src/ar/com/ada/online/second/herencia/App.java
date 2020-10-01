package ar.com.ada.online.second.herencia;

import ar.com.ada.online.second.herencia.figuras.Circulo;
import ar.com.ada.online.second.herencia.figuras.Figura;
import ar.com.ada.online.second.herencia.figuras.Rectangulo;
import ar.com.ada.online.second.herencia.figuras.Triangulo;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        ArrayList<Figura> figuras = new ArrayList<>();


        //MENU DE OPCIONES, EJECUTA METODO PARA CREACION DE OBJETOS
        for (int i = 0; i < 3; i++) {

            System.out.println("\nIngrese el tipo de figura  (1-Triangulo, 2-Circulo o 3-Rectangulo)");
            int opcion = scan.nextInt();


            switch (opcion) {
                case 1:
                    Triangulo triangulo = createTriangulo(scan);
                    figuras.add(triangulo);
                    break;

                case 2:
                    Circulo circulo = createCirculo(scan);
                    figuras.add(circulo);
                    break;

                case 3:
                    Rectangulo rectangulo = createRectangulo(scan);
                    figuras.add(rectangulo);
                    break;

                default:
                    System.out.println("Opcion incorrecta, ingrese tipo de figura (1, 2 o 3)");


            }
        }

        showResults(figuras);
    }


    //METODOS DE CREACION DE OBJETOS
    public static Triangulo createTriangulo(Scanner scan) {
        System.out.println("Ingrese la base del triangulo");
        double base = scan.nextDouble();
        System.out.println("Ingrese la altura del triangulo");
        double altura = scan.nextDouble();
        Triangulo triangulo = new Triangulo(base, altura);
        return triangulo;
    }

    public static Circulo createCirculo(Scanner scan) {
        System.out.println("Ingrese el radio del circulo");
        double radio = scan.nextDouble();
        Circulo circulo = new Circulo(radio);
        return circulo;
    }

    public static Rectangulo createRectangulo(Scanner scan) {
        System.out.println("Ingrese la base del rectangulo");
        double base = scan.nextDouble();
        System.out.println("Ingrese la altura del rectangulo");
        double altura = scan.nextDouble();
        Rectangulo rectangulo = new Rectangulo(base, altura);
        return rectangulo;

    }


    //METODO PARA MOSTRAR RESULTADOS POR PANTALLA, EJECUTA METODO DE CALCULO
    public static void showResults(ArrayList<Figura> figuras) {
        for (Figura figura : figuras) {
            figura.calculoArea();

            switch (figura.getClass().getSimpleName()) {      //get de la clase y el nombre de los elementos del array
                case "Triangulo":
                    Triangulo triangulo = (Triangulo) figura;
                    System.out.println(triangulo.toString());
                    break;

                case "Circulo":
                    Circulo circulo = (Circulo) figura;
                    System.out.println(circulo.toString());
                    break;

                case "Rectangulo":
                    Rectangulo rectangulo = (Rectangulo) figura;
                    System.out.println(rectangulo.toString());
                    break;

            }
        }
        if (areFiguresEqual(figuras)) {
            System.out.println("Existen figuras iguales.");
        } else {
            System.out.println("No existen figuras iguales.");
        }
    }

    //METODO PARA COMPARAR OBJETOS
    public static Boolean areFiguresEqual(ArrayList<Figura> figuras) {
        Boolean equals = null;
        for (int i = 0; i < figuras.size(); i++) {
            Figura figura = figuras.get(i);
            for (int j = i + 1; j < figuras.size(); j++) {
                equals = figura.equals(figuras.get(j));
                if (equals) return equals;
            }
        }
        return equals;
    }

}
