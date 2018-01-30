package ams1_uf3_pr2_david_artero;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Ejercicio1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ejercicio1_1 prog = new Ejercicio1_1();
		prog.inicio();
	}

	public void inicio() {
		// TODO Auto-generated method stub
		try {
			File Temp = new File("Temp/senars.txt");
			PrintStream ps = new PrintStream(Temp);

			for (int i = 0; i < 100; i++) {
				if (i % 2 != 0)
					ps.print(i + " ");
			}

			Temp = new File("Temp/parells.txt");
			ps = new PrintStream(Temp);

			for (int i = 0; i < 100; i++) {
				if (i % 2 == 0)
					ps.print(i + " ");
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
