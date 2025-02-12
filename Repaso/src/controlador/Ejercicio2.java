package controlador;

import java.util.Scanner;
import static java.lang.String.format;

public class Ejercicio2 {
	
	public static void main(String[] args) {
		var nota = 0.0;
		var nombre = "";
		var cont = 0;
		var lt = new Scanner(System.in);
		var acum = 0.0;
		var notaTotal = 0.0;
		
		
		System.out.println("digite su nombre: ");
		nombre = lt.next();
		
		for (int i = 0; i < 3; i++) {
			cont++;
			System.out.println("digite su nota No." + cont + ":");
			nota = lt.nextDouble();
			
			acum = acum + nota;
		}
		notaTotal = acum/ cont;
		
		var AproRepro = notaTotal >= 350 ? "APROBADO" : "REPROBADO";
		 System.out.println(AproRepro);
		 
		 var mensaje = format("su nota es: %.2f", notaTotal);
		 System.out.println(mensaje);
		 
		 
		 
	}
}