package ams1_uf3_pr1_david_artero;

import java.io.File;
import java.util.Scanner;

public class Ejercicio_2 {

	public static void main(String[] args) {
		Ejercicio_2 prog = new Ejercicio_2();
		inicio();
		
	}

	public static void inicio() {
		// TODO Auto-generated method stub
		String nomDir = System.getProperty("user.dir");
		File dir = new File(nomDir);
		Scanner s = new Scanner(System.in);
		int cont=0;
		String extensiones ="";
				
		try {
			System.out.print("\nIntroduce las 2 extensiones: ");
			extensiones=s.nextLine();
			String tiposExt[]=extensiones.split(" ");			
			String[] ficheros=dir.list();
			
			  for (int x=0;x<ficheros.length;x++) {
				  if(ficheros[x].contains(tiposExt[0])) {
					  File file = new File(dir+"/"+ficheros[x]);
				    System.out.println(ficheros[x]);
				    String cortarArchivos[]=ficheros[x].split("\\.");
				    ficheros[x]=cortarArchivos[0]+"."+tiposExt[1];
				    file.renameTo(new File(ficheros[x]));
				    dir.renameTo(new File(ficheros[x]));
				  }
			  }
			    			  
			  for (int x=0;x<ficheros.length;x++) {
				  if(ficheros[x].contains(tiposExt[1])) {
				    System.out.println(ficheros[x]);
				  }
			  }		  
			 			  
		} catch (Exception e) {
			System.out.println("No hay directorios");
		}		
		
	}

}
