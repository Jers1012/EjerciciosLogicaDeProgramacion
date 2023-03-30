package ejerciciosJava;

import java.util.Scanner;

public class FinDeSemana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String diaSemana;
        int hora;
        int minutos;

        do {
            System.out.print("Ingresa un día de la semana (Lunes - Viernes): ");
            diaSemana = scanner.nextLine().toLowerCase();
        } while (!diaSemana.equals("lunes") && !diaSemana.equals("martes") && !diaSemana.equals("miércoles") && !diaSemana.equals("jueves") && !diaSemana.equals("viernes"));

        do {
            System.out.print("Ingresa una hora (horas y minutos): ");
            String horaCompleta = scanner.nextLine();
            String[] partesHora = horaCompleta.split(":");
            hora = Integer.parseInt(partesHora[0]);
            minutos = Integer.parseInt(partesHora[1]);
        } while (hora < 0 || hora > 23 || minutos < 0 || minutos > 59);

        int minutosFaltantes = 0;

        switch (diaSemana) {
            case "lunes":
                minutosFaltantes += (24 - hora) * 60 + (60 - minutos);
                minutosFaltantes += 3 * 24 * 60 + 9 * 60;
                break;
            case "martes":
                minutosFaltantes += (24 - hora) * 60 + (60 - minutos);
                minutosFaltantes += 2 * 24 * 60 + 9 * 60;
                break;
            case "miércoles":
                minutosFaltantes += (24 - hora) * 60 + (60 - minutos);
                minutosFaltantes += 24 * 60 + 9 * 60;
                break;
            case "jueves":
                minutosFaltantes += (24 - hora) * 60 + (60 - minutos);
                minutosFaltantes += 9 * 60;
                break;
            case "viernes":
                if (hora < 15) {
                    minutosFaltantes += (15 - hora) * 60 + (0 - minutos);
                }
                break;
        }

        System.out.println("Faltan " + minutosFaltantes + " minutos para el fin de semana.");
    }
}