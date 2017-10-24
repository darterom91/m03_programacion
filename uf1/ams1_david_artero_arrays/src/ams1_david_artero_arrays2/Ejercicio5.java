package ams1_david_artero_arrays2;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vec[] = new int[10], i = 0;
		Scanner s = new Scanner(System.in);

		do {
			System.out.println("Introduce un numero " + i + " par");
			if (s.hasNextInt()) {
				vec[i] = s.nextInt();
				if (vec[i] == 0) {
					System.out.println("El numero no puede ser 0");
					s.next();
				}

				if (vec[i] % 2 == 0) {
					i++;
				} else {
					System.out.println("El numero no es par");
					s.next();
				}
			} else {
				System.out.println("Error-- No es un numero entero");
				s.next();
			}

		} while (i < vec.length);
		
		i=0;
		System.out.println("\n\n============== Array de numeros PAR ================");
		do{
			System.out.print("["+vec[i]+"] ");
			i++;
		}while(i<vec.length);
	}

}
