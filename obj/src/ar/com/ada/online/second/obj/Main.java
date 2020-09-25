package ar.com.ada.online.second.obj;

public class Main {

    public static void main(String[] args) {

        NaveStarWars nave1 = new NaveStarWars("t-60", 100);
        NaveStarWars nave2 = new NaveStarWars("t-65", 150);

        System.out.println("toString de nave1" + nave1.toString());
        System.out.println("toString de nave2" + nave2.toString());

        System.out.println("HashCode de nave1: " + nave1.hashCode());
        System.out.println(("HashCode de nave2: " + nave2.hashCode()));

        System.out.println("Los atributos de las naves tienen el mismo valor? " + nave1.equals(nave2));

    }
}
