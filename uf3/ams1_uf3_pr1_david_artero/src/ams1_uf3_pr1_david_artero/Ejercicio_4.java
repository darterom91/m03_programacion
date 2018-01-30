package ams1_uf3_pr1_david_artero;

import java.io.File;
import java.util.Date;
import java.util.Scanner;

public class Ejercicio_4 {
	public static void main(String[] args) {
		
		Ejercicio_4 prog = new Ejercicio_4();
		prog.inicio();
	}

	public static void inicio() {
		// TODO Auto-generated method stub
		String nomDir=System.getProperty("user.dir"), nomFile="";
		int option=0;
		File dir = new File(nomDir);
		Scanner s = new Scanner(System.in);
		
		
		
		System.out.print("Que archivo quieres buscar ? ");
		nomFile=s.next();
		
		System.out.println("Introduce la ruta(usar usr para visualizar desde raiz): ");
		nomDir=s.next();
		
		
		if(nomDir.contains("usr")) {
			nomDir=System.getProperty("user.dir");
			dir = new File(nomDir);
			walkin(dir, nomFile);
			
		}else {
			dir = new File(nomDir);
			walkin(dir, nomFile);
		}
		
	}


	public static void walkin(File dir, String nomFile) {
		// TODO Auto-generated method stub
		 File listFile[] = dir.listFiles();
	        if (listFile != null) {
	            for (int i = 0; i < listFile.length; i++) {
	                if (listFile[i].isDirectory()) {
	                    walkin(listFile[i], nomFile);
	                } else {
	                	if(listFile[i].getName().contains(nomFile)) {
	                		if(listFile[i].length()<500) {
	                			 Date data = new Date(listFile[i].lastModified()); 
	                			System.out.println(listFile[i].getAbsolutePath()+" - tamaño: "+listFile[i].length()+" - data: "+data);
	                		}
	                	}
	                }
	            }
	        }
	}
}
