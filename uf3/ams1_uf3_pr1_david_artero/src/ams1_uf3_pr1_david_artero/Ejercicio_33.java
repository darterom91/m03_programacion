package ams1_uf3_pr1_david_artero;

import java.io.File;
import java.util.Scanner;

public class Ejercicio_33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ejercicio_33 prog =new Ejercicio_33();
		inicio();
	}

	public static void inicio() {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		File dir = new File(System.getProperty("user.dir"));
		String ficheroBuscar = "", nomRuta = "";
		
		System.out.print("Que archivo quieres buscar? ");
		ficheroBuscar=s.next();
		
		System.out.println("En que ruta lo quieres buscar? ");
		dir = new File(dir.getPath()+"/"+nomRuta);
		System.out.println(dir.getPath());
		
	}

}