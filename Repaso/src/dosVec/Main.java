package dosVec;

import java.util.Arrays;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
		
	
	Random rand = new Random();
    int size = 10;
    int[] vec1 = new int[size];
    int[] vec2 = new int[size];

    for (int i = 0; i < size; i++) {
        vec1[i] = rand.nextInt(500) + 1;
        vec2[i] = rand.nextInt(500) + 1;
    }

    System.out.println("Vector 1: " + Arrays.toString(vec1));
    System.out.println("Vector 2: " + Arrays.toString(vec2));

    int pares1 = (int) Arrays.stream(vec1).filter(n -> n % 2 == 0).count();
    int pares2 = (int) Arrays.stream(vec2).filter(n -> n % 2 == 0).count();
    
    System.out.println("Cantidad de pares en Vector 1: " + pares1);
    System.out.println("Cantidad de pares en Vector 2: " + pares2);

    int impares1 = size - pares1;
    
    int impares2 = size - pares2;

    if (impares1 > impares2) {
        System.out.println("Vector 1 tiene más impares");
    } 
    
    else if (impares2 > impares1) {
        System.out.println("Vector 2 tiene más impares");
    } 
    
    else {
        System.out.println("Ambos tienen la misma cantidad de impares");
    }

    System.out.println("Vector 1 ordenado: " + Arrays.toString(Arrays.stream(vec1).sorted().toArray()));
    System.out.println("Vector 2 ordenado: " + Arrays.toString(Arrays.stream(vec2).sorted().toArray()));
	}
}