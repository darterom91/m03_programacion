package ex_uf3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;

public class Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File original = new File("personas.txt");
		File copia = new File("copiasPersonas.txt");
		
		FileReader fr;
		try {
			fr = new FileReader(original);
			BufferedReader br = new BufferedReader(fr);
			
			PrintStream ps = new PrintStream(copia);
			
			String linea="";
			while((linea=br.readLine())!=null){
				ps.println(linea);
			}
			System.out.println("Archivo Copido!!");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
