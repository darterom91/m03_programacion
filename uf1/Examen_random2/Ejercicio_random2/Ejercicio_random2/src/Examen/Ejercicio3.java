package Examen;

import java.util.Scanner;

public class Ejercicio3 {
	public static int N = 10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int vecA[] = new int[N], vecB[] = new int[N], vecT[] = new int[10 * 2], z = 0, j = 0;

		for (int i = 0; i < vecT.length; i++) {
			if (i % 2 != 0) {
				vecA[z] = i;
				z++;
			} else {
				vecB[j] = i;
				j++;
			}
		}
		System.out.println("\nvec A: ");
		for (int i = 0; i < vecA.length; i++) {
			System.out.println("vecA[" + vecA[i] + "]");
		}

		System.out.println("\nvec B: ");
		for (int i = 0; i < vecB.length; i++) {
			System.out.println("vecB[" + vecB[i] + "]");
		}
		z=0;
		j=0;
		for (int i = 0; i < vecT.length; i++) {
			if (i%2 != 0) {
				vecT[i] = vecA[z];
				z++;
			}else{
				vecT[i] = vecB[z];
				j++;
			}
		}
		
		System.out.println("\nvec Total: ");
		for (int i = 0; i < vecT.length; i++) {
			System.out.println("vecT[" + vecT[i] + "]");
		}

	}
}
