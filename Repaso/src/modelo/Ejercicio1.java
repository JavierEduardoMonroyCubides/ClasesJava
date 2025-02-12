package modelo;

import java.security.DomainCombiner;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		var lt = new Scanner(System.in);
		
		System.out.println("operador ternario");
		var edad = 13;
		var mayor = edad >= 18 ? 2 : "amen";
		System.out.println(mayor);
		
	}
}