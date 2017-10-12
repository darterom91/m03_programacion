package ams1_david_artero_condicionales;

import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		double kg, precio = 1.20;
		do {
			System.out.println("Introduce -1 para salir");
			System.out.print("Cuantos kg de fruta quieres? \n >: ");
			kg = s.nextDouble();
			if (kg > 0 && kg <= 2) {
				precio = precio * kg;
				System.out.println("kg: " + kg);
				System.out.println("El precio es: " + precio);
			} else if (kg > 2.01 && kg <= 5) {
				precio = precio * kg;
				System.out.println("El precio es: " + precio);
				precio = precio - precio * 0.1;
				System.out.println("kg: " + kg);
				System.out.println("El precio es con descuento: " + precio);
			} else if (kg > 5.01 && kg <= 10) {
				precio = precio * kg;
				System.out.println("El precio es: " + precio);
				precio = precio - precio * 0.15;
				System.out.println("kg: " + kg);
				System.out.println("El precio es con descuento: " + precio);
			} else if (kg > 10.01) {
				precio = precio * kg;
				System.out.println("El precio es: " + precio);
				precio = precio - precio * 0.2;
				System.out.println("kg: " + kg);
				System.out.println("El precio es con descuento: " + precio);
			}
			System.out.println("\n");
		} while (kg != -1);
		
		System.out.println("Has salido");
	}

}
