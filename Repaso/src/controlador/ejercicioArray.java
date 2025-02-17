package controlador;

import java.util.List;

public class ejercicioArray {

	public class Main {
	    public static void main(String[] args) {
	        int num = 10;
	        int suma = 0;

	        // Bucle for básico
	        for (int i = 1; i <= num; i++) {
	            suma += i;  // Suma los números del 1 al 10
	            System.out.print(suma + " "); 
	        }
	        System.out.println(); // Salto de línea

	        int[] array = {27, 78, 5, 36, 8};

	        // Bucle for para recorrer un array (forma tradicional)
	        for (int i = 0; i < array.length; i++) {
	            System.out.print(array[i] + " ");
	        }
	        System.out.println(); // Salto de línea

	        // Bucle for-each (forma simplificada para arrays)
	        for (int elemento : array) {
	            System.out.print(elemento + " ");
	        }
	        System.out.println(); // Salto de línea

	        // Ejemplo con List (Colección de Java)
	        List<String> frutas = List.of("Pera", "Mango", "Manzanas", "Fresas");

	        // Bucle for-each para la lista
	        for (String fruta : frutas) {
	            System.out.print(fruta + " ");
	        }
	        System.out.println(); // Salto de línea
	    }
	}
}
