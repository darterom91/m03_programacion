package ams1_uf3_pr4_david_artero;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {
	public static int v = 10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ejercicio3 prog = new Ejercicio3();
		prog.inicio();
	}

	public void inicio() {
		// TODO Auto-generated method stub
		File Temp = null;
		Scanner s = new Scanner(System.in);
		String fichero = "", lista="";
		double resultado=0;
		double notas[] = new double[v];
		int i=0;
		FileReader fr=null ;
		do {
			System.out.println("Introduce el nombre del archivo: ");
			System.out.print(":<");
			fichero = s.next();
			Temp = new File(fichero);
			if (!Temp.isFile()) {
				System.out.println(Temp.isFile());
				CrearFichero(Temp, notas);
				
			} else {
				System.out.println(Temp.isFile());
			}

		} while (Temp.isFile() != true);
		
		try {
			fr = new FileReader(Temp);
			BufferedReader br = new BufferedReader(fr);
			while ((lista = br.readLine()) != null) {
					System.out.println(lista);
					if(!lista.contains("-1")){
					notas[i]=Double.parseDouble(lista);
					i++;
					}
			}
			Arrays.sort(notas);
			
			File histo = new File("histogramaNotas.txt");
			PrintStream ps = new PrintStream(histo);
			ps.println("notas  |  Clasificacion\n"
					+  "-----  |------------------------");
			System.out.println("notas  |  Clasificacion\n"
							+  "-----  |------------------------");
			ps.print("Sus:   |");
			System.out.print("Sus:   |");
			for( i=0;i<notas.length;i++){
				if(notas[i]==0 || notas[i]<5){
					ps.print("*");
					System.out.print("*");
				}
			}
			ps.print("\nSuf:   |");
			System.out.print("\nSuf:   |");
			for( i=0;i<notas.length;i++){
				if(notas[i]==5 || notas[i]<6.5){
					ps.print("*");
					System.out.print("*");
				}
			}
			ps.print("\nNotab: |");
			System.out.print("\nNotab: |");
			for( i=0;i<notas.length;i++){
				if(notas[i]==6.5 || notas[i]<9){
					ps.print("*");
					System.out.print("*");
				}
			}
			ps.print("\nExcel: |");
			System.out.print("\nExcel: |");
			for( i=0;i<notas.length;i++){
				if(notas[i]==9 || notas[i]<10){
					ps.print("*");
					System.out.print("*");
				}
			}
			
			if(histo.isFile()){
				System.out.println("\nHistograma de notas modificado!!! ");
			}else{
				System.out.println("\nHistograma de notas creado!!! ");
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}


	public void CrearFichero(File temp, double[] notas) {
		// TODO Auto-generated method stub
		try {
			double valor = 0;

			PrintStream ps = new PrintStream(temp);
			for (int i = 0; i < v; i++) {
				ps.println((Math.random() * (10 - 1) + 1) + " ");
			}
			ps.print(-1);
			System.out.println("Fichero Creado!!!");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
