package ams1_uf3_pr1_david_artero;

import java.io.File;
import java.util.Scanner;

public class Ejercicio_32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ejercicio_3 prog = new Ejercicio_3();
		inicio();

	}

	public static void inicio() {
		// TODO Auto-generated method stub
		String nomDir=System.getProperty("user.dir"), nomFile="";
		int option=0;
		File dir = new File(nomDir);
		Scanner s = new Scanner(System.in);
		
		
		do{
		System.out.print("Que archivo quieres buscar ? ");
		nomFile=s.next();
		System.out.println("Introduce la ruta: ");
		nomDir=s.next();
		if(nomDir.equals("usr")) {
			nomDir=System.getProperty("user.dir");
			dir = new File(nomDir);
			File ficheros[] = dir.listFiles();
			for(int i=0;i<ficheros.length;i++) {
				if(ficheros[i].getName().contains(nomFile))
					System.out.println(ficheros[i].getPath());
			}
		}else {
			dir = new File(nomDir);
			File ficheros[] = dir.listFiles();
			for(int i=0;i<ficheros.length;i++) {
				if(ficheros[i].getName().contains(nomFile))
					System.out.println(ficheros[i].getPath());
			}
		}
		}while(nomFile.equals("exit"));
		
	}

}
