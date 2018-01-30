package ams1_uf3_pr3_david_artero;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ejercicio2 prog = new Ejercicio2();
		prog.inicio();
	}

	public void inicio() {
		// TODO Auto-generated method stub
		File Temp = null;
		String personas[] = new String[3];
		String personasM[][] = new String[3][8];
		double notas[][] = new double[3][10];
		String nombres[][] = new String[3][3];
		double media = 0;
		int cont = 0;

		int i = 0, j = 0;
		String linea, valor;

		try {
			Temp = new File("Temp/notas2.txt");
			FileReader fr = new FileReader(Temp);
			BufferedReader br = new BufferedReader(fr);

			while ((linea = br.readLine()) != null) {
				if (!linea.contains("fi")) {
					personas[i] = linea;
					i++;
				}
			}

			for (i = 0; i < personas.length; i++) {
				personasM[i] = personas[i].split(" ");
			}

			for (i = 0; i < personasM.length; i++) {
				for (j = 0; j < personasM[i].length; j++) {
					if (!personasM[i][j].equals("-1")) {
						System.out.print(personasM[i][j] + " ");
					}
				}
				System.out.println();
			}

			for (i = 0; i < personasM.length; i++) {
				for (j = 0; j < personasM[i].length; j++) {
					if (j < 2) {
						nombres[i][j] = personasM[i][j];
					} else if (j >= 2) {
						if (!personasM[i][j].equals("-1")) {
							notas[i][j] = Double.parseDouble(personasM[i][j]);
							System.out.print(notas[i][j] + " ");
						}
					}
				}
				System.out.println();
			}
			for (i = 0; i < notas.length; i++) {
				cont = 0;
				for (j = 0; j < notas[i].length; j++) {
					if (notas[i][j] != 0) {
						cont++;
						System.out.print(notas[i][j] + " ");
						media = media + notas[i][j];
					}
				}
				System.out.println("\nMedia: "+media);
				media = media / cont;
				System.out.print("-- cont: " + cont + " medias:" + media);
				nombres[i][2]=""+media;
				System.out.println();
			}
			File temp2 =new File("");
			PrintStream ps = new PrintStream("Temp/notasMedias.txt");
			for (i = 0; i < nombres.length; i++) {
				for (j = 0; j < nombres.length; j++) {
					ps.print(nombres[i][j]+" ");
				}
				ps.println();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
