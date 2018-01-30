package ams1_uf3_pr2_david_artero;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio1_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ejercicio1_4 prog = new Ejercicio1_4();
		prog.inicio();
	}

	public void inicio() {
		// TODO Auto-generated method stub
		File Temp = null;
		FileReader fr = null;
		BufferedReader br = null;
		try {
			Temp = new File("Temp/personas.txt");
			 fr = new FileReader (Temp);
			 br = new BufferedReader(fr);
			 
	         String linea;
	         String personas[] =new String[10];
	         int i=0;
	      // Lectura del fichero
	         
	         while((linea=br.readLine())!=null){
	            System.out.println(linea);
	            personas[i]=linea;
	            i++;
	         }
	         int cont = i;
	         
	         for(i = 0; i<cont-1;i++){
	        	 if(personas[i].contains("18"))
	        	 System.out.println(personas[i]);
	         }

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(null!=fr){
					fr.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}

}
