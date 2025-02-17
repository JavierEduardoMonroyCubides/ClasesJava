package precioProduc;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Pedir al usuario la cantidad de productos
            System.out.print("Ingrese la cantidad de productos: ");
            int cantidadProductos = scanner.nextInt();

            // Crear arreglo para precios originales
            double[] precios = new double[cantidadProductos];

            // Pedir al usuario los precios de los productos
            for (int i = 0; i < cantidadProductos; i++) {
                System.out.print("Ingrese el precio del producto " + (i + 1) + ": ");
                precios[i] = scanner.nextDouble();
            }

            // Calcular descuentos usando Stream y Collectors.toList()
            double[] preciosConDescuento = Arrays.stream(precios)
                    .map(precio -> precio > 55000 ? precio * 0.90 : precio * 0.95)
                    .toArray();

            // Mostrar los precios originales y con descuento
            System.out.println("Precios originales: " + Arrays.toString(precios));
            System.out.println("Precios con descuento: " + Arrays.toString(preciosConDescuento));

            scanner.close();
        }
}
