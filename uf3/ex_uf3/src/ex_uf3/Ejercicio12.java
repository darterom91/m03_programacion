package ex_uf3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File temp = new File("doc1.txt");
		Scanner s = new Scanner(System.in);
		String nombre = "";
		int edad = 0, i = 0;
		System.out.println("Introduce el nombre:");
		nombre = s.next();
		do {
			System.out.println("Introduce el Edad:");
			if (s.hasNextInt()) {
				edad = s.nextInt();
				i = 1;
			} else {
				System.out.println("Valor no entero...");
				s.next();
			}
		} while (i != 1);

		PrintStream ps = new PrintStream(temp);
		ps.print("nombre: " + nombre);
		ps.println();
		ps.print("apellido: " + edad);
		
		ps.close();
	}

}
