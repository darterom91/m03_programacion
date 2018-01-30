package ex_uf3;

import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		String dir = System.getProperty("user.dir");
		File temp = new File("temp");
		Scanner s = new Scanner(System.in);
		String fixe = "";
		String doc = "";
		String[] carpeta = temp.list();
		for(int i=0;i<carpeta.length;i++){
			File files = new File(temp+"/"+carpeta[i]);
			System.out.println(files.getName());
		}
		
		System.out.println("Que archivo buscas ?");
		fixe=s.next();
		
		System.out.println("introduce el nombre de la carpeta:");
		doc=s.next();
		
		if(!doc.equals("user")){
		temp=new File(doc);
		}else{
		temp= new File(dir);
		}
		
		for(int i=0;i<carpeta.length;i++){
			if(carpeta[i].equals(fixe)){
			File files = new File(temp+"/"+carpeta[i]);
			System.out.println(files.getName());
			}
		}
		
	}
}
