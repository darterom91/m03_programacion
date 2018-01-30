package ams1_uf3_pr2_david_artero;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Ejercicio1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ejercicio1_3 prog = new Ejercicio1_3();
		prog.inicio();
	}

	public void inicio() {
		// TODO Auto-generated method stub
		int option = 0, i = 0, cont = 0;
		Scanner s = new Scanner(System.in);
		String[] personas = new String[10];
		String res = "";

		while (i < personas.length) {
			
			cont++;
			
			System.out.println("Introducir personas: ");
			personas[i] = llegirPersona(i);
			System.out.println(personas[i]);

			System.out.println("Quieres introducir mas personas ?");
			res = s.next();
			if (res.equals("no")) {
				break;
			}
			i++;

		}
		System.out.println("Escriure persona a Disc: ");

		escriurePersonaADisc(personas, cont);

	}

	private void escriurePersonaADisc(String[] personas, int cont) {
		// TODO Auto-generated method stub
		File Temp = null;
		try {
			Temp = new File("Temp/personas.txt");
			PrintStream ps = new PrintStream(Temp);
			
			int i = 0;

			for (i = 0; i < cont; i++) {
				ps.println(personas[i]);				
				System.out.println("Introducidos: ");
				System.out.println(personas[i]);
			}
			ps.println("fi");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public int introNumInt() {
		// TODO Auto-generated method stub
		int option = 0;
		boolean bol = false;
		Scanner s = new Scanner(System.in);
		do {
			if (s.hasNextInt()) {
				option = s.nextInt();
				bol = true;
			} else {
				System.out.println("El valor no es entero");
				s.next();
				System.out.println("Menu \n1- Introducir personas \n2- Escriure persona a Disc \n3- Salir");
				System.out.print("\n<: ");
			}
		} while (bol != true);
		return option;
	}

	public double introNumDouble() {
		// TODO Auto-generated method stub
		double option = 0;
		boolean bol = false;
		Scanner s = new Scanner(System.in);
		do {
			if (s.hasNextDouble()) {
				option = s.nextDouble();
				bol = true;
			} else {
				System.out.println("El valor no es real");
				s.next();
				System.out.print("\n<: ");
			}
		} while (bol != true);
		return option;
	}

	private String llegirPersona(int cont) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String persona = "", nom = " ", cognom = " ";
		int nif = 0, edad = 0;
		double altura = 0;

		System.out.print("Introduce el Nombre de la persona " + cont + ": ");
		nom = s.next();

		System.out.print("Introduce el Apellido de la persona " + cont + ": ");
		cognom = s.next();

		System.out.print("Introduce el nif de la persona " + cont + ": ");
		nif = introNumInt();

		System.out.print("Introduce el edad de la persona " + cont + ": ");
		edad = introNumInt();

		System.out.print("Introduce el altura de la persona " + cont + ": ");
		altura = introNumDouble();

		persona += nom + " " + cognom + " " + nif + " " + edad + " " + altura;

		return persona;
	}

}
