package ejerciciosJava;

import java.util.Scanner;

public class NumerosPrimos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingresa un número: ");
            numeros[i] = scanner.nextInt();
        }

        int[] primos = new int[numeros.length];
        int[] noPrimos = new int[numeros.length];
        int contadorPrimos = 0;
        int contadorNoPrimos = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (esPrimo(numeros[i])) {
                primos[contadorPrimos] = numeros[i];
                contadorPrimos++;
            } else {
                noPrimos[contadorNoPrimos] = numeros[i];
                contadorNoPrimos++;
            }
        }

        for (int i = 0; i < contadorPrimos; i++) {
            System.out.println("pos[" + i + "] = " + primos[i]);
        }

        for (int i = 0; i < contadorNoPrimos; i++) {
            System.out.println("pos[" + (i + contadorPrimos) + "] = " + noPrimos[i]);
        }
    }

    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }
}