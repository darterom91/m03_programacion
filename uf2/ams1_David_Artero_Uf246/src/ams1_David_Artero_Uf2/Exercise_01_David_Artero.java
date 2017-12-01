package ams1_David_Artero_Uf2;

import java.util.Scanner;

public class Exercise_01_David_Artero {
	public static Scanner keyboard;

	public static void main(String[] arguments) {
		keyboard = new Scanner(System.in);
		int number;
		number = readNumber();
		numberN(number);
	}

	public static int readNumber() {
		Scanner s = new Scanner(System.in);
		int num = 0, i = 0;
		do {
			System.out.println("Introduce un valor: ");
			if (s.hasNextInt()) {
				num = s.nextInt();
				i++;
			} else {
				System.out.println("El valor no es entero...");
				s.next();
			}
		} while (i < 1);
		return num;
	}

	public static void numberN(int num) {
		for(int i=0;i<num;i++){
			System.out.println("Module executed");
		}
	}
}