package ams1_david_artero_estructures_repetitives2;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num, i, j, x, res = 0, res2;

		System.out.println("Introduce un numero: ");
		num = s.nextInt();
		res2 = num;

		for (i = 0; i < num; i++) {
			res = res + 2;
			res2 = res2 - 1;
			System.out.println("");

			for (x = res2; x > 0; x--) {
				System.out.print(" ");
			}

			for (j = 1; j <= res-1; j++) {
				System.out.print("*");
			}

		}
	}

}
