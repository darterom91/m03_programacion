package ams1_uf3_pr3_david_artero;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ejercicio1 prog = new Ejercicio1();
		prog.inicio();
	}

	public void inicio() {
		// TODO Auto-generated method stub
		File Temp = null;
		String personas[] = new String[3];
		String personasM[][] = new String[3][8];
		double notas[][] = new double[3][10];
		String nombres[][] = new String[3][3];
		double media = 0, cont = 0;

		int i = 0, j = 0;
		String linea;

		try {
			Temp = new File("Temp/notas.txt");
			FileReader fr = new FileReader(Temp);
			BufferedReader br = new BufferedReader(fr);

			while ((linea = br.readLine()) != null) {
				if (!linea.contains("fi")) {
					personas[i] = linea;
					i++;
				}
			}
			i = 0;
			while (i < personasM.length) {
				personasM[i] = personas[i].split(" ");
				i++;
			}

			i = 0;
			while (i < personasM.length) {
				j = 0;
				while (j < personasM[i].length) {
					if (j < 2) {
						System.out.print(personasM[i][j] + " ");
						nombres[i][j] = personasM[i][j];
					} else if (j >= 2) {
						System.out.println();
						notas[i][j] = Double.parseDouble(personasM[i][j]);
						System.out.print(notas[i][j] + " ");
					}
					j++;
				}
				System.out.println();
				i++;
			}
			i = 0;

			while (i < notas.length) {
				j = 0;
				cont = 0;
				while (j < notas[i].length) {
					if (notas[i][j] != 0) {
						cont++;
						System.out.println("notas:"+notas[i][j]+" cont: "+cont);
						media = media + notas[i][j];
					}
					j++;
				}
				System.out.println("\nsuma:" +media);
				media = media / cont;
				nombres[i][2] = "" + media;
				System.out.println("\n" + nombres[i][2] + " -- cont: " + cont);
				i++;
			}
			System.out.println("\n\nNotas media y alumnos\n"
								+  "----- ----- - -------");
			i = 0;
			while (i < nombres.length) {
				j = 0;
				cont = 0;
				while (j < nombres[i].length) {
					System.out.print(nombres[i][j]+" ");
					j++;
				}
				System.out.println();
				i++;
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
