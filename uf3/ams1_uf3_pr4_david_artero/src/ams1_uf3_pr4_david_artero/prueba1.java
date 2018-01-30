package ams1_uf3_pr4_david_artero;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.RandomAccessFile;

public class prueba1 {
	public static void main(String[] args) {
		prueba1 prog = new prueba1();
		prog.inicio();
	}

	public void inicio() {
		// TODO Auto-generated method stub
		File temp = new File("Ejercicio1.java");
		File temp2 = new File("Ejercicio1.bin"); 
		FileReader fr;
		FileWriter fw;
		int cont=0;
		String linea="";
		String lineas[]=new String[76];
		try {
			fr = new FileReader(temp);
			fw = new FileWriter(temp2);
			BufferedReader br = new BufferedReader(fr);
			PrintStream ps = new PrintStream(temp2);
			while((linea=br.readLine())!=null){
				lineas[cont]=linea;
				cont++;
			}
			
			for(int i=0;i<lineas.length;i++){
				System.out.println(lineas[i]);
			}
			
			pasaraBin(temp2, lineas);
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void pasaraBin(File temp2, String[] lineas) {
		// TODO Auto-generated method stub
		try {
			RandomAccessFile raf = new RandomAccessFile(temp2, "rw");
			for(int i=0;i<lineas.length;i++){
				byte bytes[]=lineas[i].getBytes();
				raf.writeInt(bytes.length);
				raf.writeBytes(lineas[i]);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
