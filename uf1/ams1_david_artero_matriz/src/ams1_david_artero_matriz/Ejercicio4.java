package ams1_david_artero_matriz;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int mat[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } }, i = 0, j = 0, aux;
		
		System.out.println("mostrando matriz inicial:");
		System.out.print("   ");
		for (i = 0; i < mat.length; i++) {
			System.out.print(i + "  ");
		}
		System.out.println("");

		for (i = 0; i < mat.length; i++) {

			System.out.print("" + i + " ");
			for (j = 0; j < mat[i].length; j++) {
				System.out.print("[" + mat[i][j] + "]");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Calculos");
		for (i = 0; i < mat.length - 1; i++) {
			System.out.println(i);
			for (j = i + 1; j < mat[i].length; j++) {
				aux = mat[i][j];// Linea = 0 columna = 0,1,2 | Linea = 1 columna
								// = 0,1,2 | Linea = 0 columna = 0,1,2 |
				System.out.println("aux = " + aux + " mat[" + i + "][" + j + "] = " + mat[i][j]);
				mat[i][j] = mat[j][i];// Linea = 0,1,2 columna = 0 | Linea =
										// 0,1,2 columna = 1 | Linea = 0,1,2
										// columna = 2 |
				System.out.println(
						"mat[" + i + "][" + j + "] = " + mat[i][j] + " mat[" + j + "][" + i + "] = " + mat[i][j]);
				mat[j][i] = aux;
				System.out.println("mat[" + j + "][" + i + "] = " + mat[j][i] + " aux = " + aux);
				System.out.println();
			}
			System.out.println();
		}

		System.out.println("Cambiando de columna a linea y de linea a columna: ");
		System.out.print("   ");
		for (i = 0; i < mat.length; i++) {
			System.out.print(i + "  ");
		}
		System.out.println("");

		for (i = 0; i < mat.length; i++) {

			System.out.print("" + i + " ");
			for (j = 0; j < mat[i].length; j++) {
				System.out.print("[" + mat[i][j] + "]");
			}
			System.out.println();
		}
	}

}
