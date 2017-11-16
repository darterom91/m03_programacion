package Ejercicios;

import java.util.Scanner;

public class Ejercicio5 {
	public static int N = 5;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String palabras[] = new String[5];
		for (int i = 0; i < palabras.length; i++) {
			System.out.println("Introduce la palabra " + i + ": ");
			palabras[i] = s.next();
		}
		System.out.println("Sale");

		for (int i = palabras.length-1; i >= 0; i--) {
			System.out.println(+i + " " + palabras[i]);
		}
	}

}
