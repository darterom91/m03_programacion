package ams1_david_artero_arrays;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num = 0, i = 0;
		int vec[] = new int[10];
		boolean bol = false;
		
		while (i < vec.length) {
			do {
				System.out.println("Introduce el numero " + i + ":");
				if (s.hasNextInt()) {
					vec[i] = s.nextInt();
					bol = true;
				} else {
					System.out.println("Er.. -no es un numero entero");
					s.next();
				}
				i++;
			} while (bol != true);
		}
		
		System.out.println("===============================================");		
		bol = false;
		do {
			System.out.println("Introduce un numero");
			if (s.hasNextInt()) {
				num = s.nextInt();
				bol = true;
			} else {
				System.out.println("Er.. -no es un numero entero");
				s.next();
			}
		} while (bol != true);
		
		System.out.println("\n================== Mayores =============================\n");
		for (i = 0; i < vec.length; i++) {
			if (num < vec[i]) {
				System.out.println(num + " < " + vec[i]);
			}
		}
		
		System.out.println("\n================= Menores ==============================");
		for (i = 0; i < vec.length; i++) {
			if (num > vec[i]) {
				System.out.println(num + " > " + vec[i]);
			}
		}
	}
}
