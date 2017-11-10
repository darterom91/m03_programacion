package ams1_david_artero_matriz;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int mat[][] = new int[3][3], i = 0, j = 0, aux = 0;
		for (i = 0; i < mat.length; i++) {
			j = 0;
			do {
				System.out.println("Introduce el valor de vec [" + i + "] [" + j + "]: ");
				if (s.hasNextInt()) {
					mat[i][j] = s.nextInt();
					j++;
				} else {
					System.out.println("El valor no es entero...");
					s.next();
				}
			} while (j < mat[i].length);
		}
		System.out.println("\nMostrar numeros introducidos en la matriz: \n");
		for (i = 0; i < mat.length; i++) {
			for (j = 0; j < mat[i].length; j++) {
				System.out.print("[" + mat[i][j] + "]");
			}
			System.out.println();
		}

		for (j = 0; j < mat.length; j++) {
			aux = mat[0][j];
			mat[0][j] = mat[2][j];
			mat[2][j] = aux;
		}
		System.out.println("\nMostrar numeros cambiados de la fila 0 y 2 de la matriz: \n");
		for (i = 0; i < mat.length; i++) {
			for (j = 0; j < mat[i].length; j++) {
				System.out.print("[" + mat[i][j] + "]");
			}
			System.out.println();
		}

	}

}
