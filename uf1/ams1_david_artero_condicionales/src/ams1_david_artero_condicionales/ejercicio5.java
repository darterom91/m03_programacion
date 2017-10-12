package ams1_david_artero_condicionales;

import java.util.Scanner;

public class ejercicio5 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int option;
		double euro, yen, dolar;

		do {
			System.out.println("Menu de divisas\n" + "---- -- -------");
			System.out.println("1. Euros a Dolars");
			System.out.println("2. Euros a Yens");
			System.out.println("3. Dolars a Euros");
			System.out.println("4. Dolars a Yens");
			System.out.println("5. Yens a Euros");
			System.out.print("6. Yens a Dolars\n7. salir\n\n>: ");

			option = s.nextInt();

			switch (option) {
			case 1:
				System.out.println("1. Euros a Dolars");
				System.out.println("Introduce Euros");
				euro = s.nextDouble();
				dolar = euro * 1.18;
				System.out.println("Dolares: " + dolar);
				System.out.print("\n\nIntroduce cualquier caracter para continuar");
				s.next();
				break;

			case 2:
				System.out.println("2. Euros a Yens");
				System.out.println("Introduce Euros");
				euro = s.nextDouble();
				yen = euro * 132.88;
				System.out.println("Dolares: " + yen);
				System.out.print("\n\nIntroduce cualquier caracter para continuar");
				s.next();
				break;

			case 3:
				System.out.println("3. Dolars a Euros");
				System.out.println("Introduce Dolars");
				dolar = s.nextDouble();
				euro = dolar / 1.18;
				System.out.println("Dolares: " + euro);
				System.out.print("\n\nIntroduce cualquier caracter para continuar");
				s.next();
				break;

			case 4:
				System.out.println("4. Dolars a Yens");
				System.out.println("Introduce Dolars");
				dolar = s.nextDouble();
				yen = dolar * 112.16;
				System.out.println("Dolares: " + yen);
				System.out.print("\n\nIntroduce cualquier caracter para continuar");
				s.next();
				break;

			case 5:
				System.out.println("5. Yens a Euros");
				System.out.println("Introduce Yens");
				yen = s.nextDouble();
				euro = yen / 132.88;
				System.out.println("Dolares: " + euro);
				System.out.print("\n\nIntroduce cualquier caracter para continuar");
				s.next();
				break;

			case 6:
				System.out.println("6. Yens a Dolars");
				System.out.println("Introduce Yens");
				yen = s.nextDouble();
				dolar = yen / 112.16;
				System.out.println("Dolares: " + dolar);
				s.next();
				break;
			case 7:
				System.out.println("Has salido");
				break;

			default:
				System.out.println("Error opción incorrecta");
				s.next();
				break;

			}
		} while (option != 7);
	}
}
