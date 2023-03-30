package ejerciciosJava;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Juego {
    public static void main(String[] args) {
        HashMap<String, String> diccionario = new HashMap<String, String>();
        diccionario.put("gato", "cat");
        diccionario.put("perro", "dog");
        diccionario.put("casa", "house");
        diccionario.put("coche", "car");
        diccionario.put("libro", "book");
        diccionario.put("mesa", "table");
        diccionario.put("silla", "chair");
        diccionario.put("computadora", "computer");
        diccionario.put("teléfono", "phone");
        diccionario.put("televisión", "television");
        diccionario.put("departamento", "apartment");
        diccionario.put("ciudad", "city");
        diccionario.put("país", "country");
        diccionario.put("música", "music");
        diccionario.put("película", "movie");
        diccionario.put("comida", "food");
        diccionario.put("bebida", "drink");
        diccionario.put("ropa", "clothes");
        diccionario.put("zapatos", "shoes");
        diccionario.put("dinero", "money");

        String[] palabras = {"gato", "perro", "casa", "coche", "libro"};
        Random random = new Random();
        int aciertos = 0;
        int fallos = 0;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < palabras.length; i++) {
            String palabra = palabras[random.nextInt(palabras.length)];
            System.out.print(palabra + ": ");
            String respuesta = scanner.nextLine().toLowerCase();

            if (diccionario.get(palabra).equals(respuesta)) {
                System.out.println("¡Correcto!");
                aciertos++;
            } else {
                System.out.println("Incorrecto. La respuesta correcta es: " + diccionario.get(palabra));
                fallos++;
            }
        }

        System.out.println("\nAciertos: " + aciertos);
        System.out.println("Fallos: " + fallos);
    }
}