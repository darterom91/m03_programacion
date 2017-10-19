package ams1_david_artero_estructures_repetitives;

import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int amplada, alçada;
		System.out.println("introduce la altura");
		alçada = s.nextInt();
		System.out.println("Introduce l' amplada");
		amplada = s.nextInt();

		for (int i = 0; i < alçada; i++) {
			for (int j = 0; j < amplada; j++) {
//				Comprueba que sí I==0 y J==0 en el caso de que  se cumpla 1 introducira un * , sí 
//				no se cumple nunguna introducira un espacio
				
//				En e caso de las lineas con espacio se cumple el j=0 y j=amplada-1, por eso introduce un * al inicio y final
				
				if (i == 0 || i == alçada-1 || j == 0 || j == amplada-1) {
					System.out.print(" * ");
				} else {
					System.out.print("   ");
				}
			}
			System.out.println(" linea: " + i);
		}
	}
}
