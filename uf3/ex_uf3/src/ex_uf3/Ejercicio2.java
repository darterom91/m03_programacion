package ex_uf3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dir = System.getProperty("user.dir");
		File temp = new File(dir);
		Scanner s = new Scanner(System.in);
		String ficheros[] = temp.list();
		String ext = "";
		System.out.print("Introduce las dos extensiones seaparadas por un espacio: ");
		ext = s.nextLine();
		String desc[] = ext.split(" ");

		for (int i = 0; i < ficheros.length; i++) {
			if (ficheros[i].contains(desc[0])) {
				File files = new File(temp + "/" + ficheros[i]);
				System.out.println(ficheros[i]);
				String descFile[]=ficheros[i].split("\\.");
				ficheros[i]=descFile[0]+"."+desc[1];
				files.renameTo(new File(ficheros[i]));
				temp.renameTo(new File(ficheros[i]));
				System.out.println(files.getName());
			}
		}
		
		for(int i=0;i<ficheros.length;i++){
			if(ficheros[i].contains(desc[1])){
				File files = new File(temp + "/" + ficheros[i]);
				System.out.println(files.getName());
			}
		}

	}

}
