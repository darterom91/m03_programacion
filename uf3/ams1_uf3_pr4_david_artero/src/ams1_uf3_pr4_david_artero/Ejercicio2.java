package ams1_uf3_pr4_david_artero;

import java.io.File;
import java.io.FileNotFoundException;
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
		try {
			String fichero = " ", texto=" ";
			boolean escribir = true; 
			Scanner s = new Scanner(System.in);

			do {
				System.out.println("Introduce el nombre del fichero: ");
				fichero = s.next();
				Temp = new File(fichero);
				if (!Temp.isFile()) {
					System.out.println(Temp.isFile());
					crearFichero(Temp);

				} else {
					System.out.println(Temp.isFile());
				}
			} while (Temp.isFile() != true);
			PrintStream ps = new PrintStream(Temp);
			
			System.out.println("Escribe cosas");
			System.out.print("<:");
			do{
				texto=s.nextLine();		
				if(".".equals(texto)){
					escribir=false;
				}else{
					escribir=true;
					ps.print(texto);
				}
			}while(escribir!=false);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void crearFichero(File temp) {
		// TODO Auto-generated method stub
		try {
			PrintStream ps = new PrintStream(temp);
			ps.print("");
			System.out.println("FICHERO CREADO!!!!");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
