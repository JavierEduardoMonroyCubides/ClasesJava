package nombre2ejercicio;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuántos nombres quieres ingresar? ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        String[] nombre = new String[n];

        // Leer los nombres
        for (int i = 0; i < n; i++) {
            System.out.print("Ingresa el nombre " + (i + 1) + ": ");
            nombre[i] = scanner.nextLine();
        }

        // Encontrar el nombre más largo
        String nombreMasLargo = "";
        int posi = -1;

        for (int i = 0; i < n; i++) {
            if (nombre[i].length() > nombreMasLargo.length()) {
                posi = i;
            }
        }

        // Mostrar el resultado
        System.out.println("El nombre más largo es: " + nombreMasLargo);
        System.out.println("Posición: " + (posi+1));
    }
}
