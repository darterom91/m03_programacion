package Examen;

import java.util.Scanner;

public class Ejercicio3 {

	public static final int preuH = 30;
	public static final double preuC = 0.5;
	public static final double iva = 1.20;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int horasT = 0, i = 0;
		double precio, precioT, metrosC = 0;

		do {
			System.out.println("Introduce las horas trabajadas: ");
			if (s.hasNextInt()) {
				horasT = s.nextInt();
				i++;
			} else {
				System.out.println("No es un valor entero...");
				s.next();
			}
		} while (i < 1);

		i = 0;
		do {
			System.out.println("Introduce los metros de cable: ");
			if (s.hasNextDouble()) {
				metrosC = s.nextDouble();
				i++;
			} else {
				System.out.println("No es un valor numerico...");
				s.next();
			}
		} while (i < 1);

		precio = horasT * preuH;
		precio = precio + (metrosC * 2);

		precioT = precio * iva;
		
		System.out.println("\n============= El Importe del servicio =================");
		System.out.println("El precio sin iva es: " + precio);
		System.out.println("El precio con iva es: " + precioT);
	}

}
