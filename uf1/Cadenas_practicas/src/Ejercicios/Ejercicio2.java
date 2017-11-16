package Ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String frase = "Hi havia una vegada una noia";
		String palabras[] = frase.split(" ");
		for (int i = 0; i < palabras.length; i++) {
			for (int j = 0; j < (palabras[i].length()/2.5); j++) {
				System.out.print(palabras[i].charAt(j));
			}
			System.out.println();
		}
	}

}
