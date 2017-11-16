package Ejercicios;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String frase, frase2, frase3;
		
		System.out.println("Introduce la frase1 :");
		frase=s.nextLine();
		System.out.println("Introduce la frase2 :");
		frase2=s.nextLine();
		frase3=frase.concat(frase2);
		System.out.println(frase3);
	}
}
