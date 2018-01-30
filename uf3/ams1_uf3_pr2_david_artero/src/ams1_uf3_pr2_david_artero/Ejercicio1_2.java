package ams1_uf3_pr2_david_artero;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1_2 {
	public static void main(String[] args) {
		Ejercicio1_2 prog = new Ejercicio1_2();
		prog.inicio();
	}

	public void inicio() {
		// TODO Auto-generated method stub

		try {
			File Temp = new File("Temp/senars.txt");
			Scanner s = new Scanner(Temp);
			int num[]=new int[50];
			int num2[]=new int[50];
			int numT[]=new int[num.length+num2.length];
			
			System.out.println("Long total: "+numT.length);
			
			System.out.println("Senars: ");
			for (int i = 0; i < 50; i++) {
				int mida = s.nextInt();
				num[i]=mida;
				System.out.print(num[i]);
			}
			s.close();
			
			Temp = new File("Temp/parells.txt");
			Scanner s2 = new Scanner(Temp);
			System.out.println("\nParells: ");
			for (int i = 0; i < 50; i++) {
				int mida = s2.nextInt();
				num2[i]=mida;
				System.out.print(num2[i]);
			}
			s2.close();
			
			for (int i = 0; i < 50; i++) {				
				numT[i]=num2[i];
			}
			
			for (int i = 50; i < 100; i++) {				
				numT[i]=num[i-50];
			}

			Arrays.sort(numT);
			
			System.out.println("\nNumeros TOTAL: ");
			for (int i = 1; i < 100; i++) {				
				System.out.print(numT[i]);
			}
			
			Temp = new File("Temp/100X100.txt");
			PrintStream ps = new PrintStream(Temp);
			
			for (int i = 1; i < 100; i++) {	
				ps.print(numT[i]+" ");
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
