package ejerciciosJava;

import java.util.HashMap;
import java.util.Scanner;

public class Diccionario {
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

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa una palabra en español: ");
        String palabra = scanner.nextLine().toLowerCase();

        if (diccionario.containsKey(palabra)) {
            System.out.println(diccionario.get(palabra));
        } else {
            System.out.println("La palabra no se encuentra en el diccionario.");
        }
    }
}