package ams1_uf3_pr4_david_artero;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ejercicio1 prog=new Ejercicio1();
		prog.inicio();
	}

	public void inicio() {
		// TODO Auto-generated method stub
		File Temp = new File("ComptaParaulesFitxer.txt");
		
		if(!Temp.isFile()){
		crearFichero(Temp);
		System.out.println("Fichero Creado !!!");
		}else{
			System.out.println("El fichero ya existe.\n");
		}
		try {
			FileReader fr = new FileReader(Temp);
			BufferedReader br = new BufferedReader(fr);
			String linea;
			int cont=0;
			String palabras[][]=new String[5][7];
			int contPalabras[]=new int[5];
			
			while ((linea = br.readLine()) != null) {
				if(!linea.equals("fi")) {
				System.out.println("linea numero: "+cont+" = "+linea);
				palabras[cont]=linea.split(" ");
				cont++;
				}
			}
			System.out.println("\n-----------------------\n");
			for (int i = 0; i < palabras.length; i++) {
				for (int j = 0; j < palabras[i].length; j++) {
					System.out.print(palabras[i][j]+" ");
					contPalabras[i]=(j+1);
				}
				System.out.println();
			}
			
			for(int i=0;i<contPalabras.length;i++){
				System.out.println("La linea "+(i+1)+" té "+contPalabras[i]+" paraules");
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void crearFichero(File temp) {
		// TODO Auto-generated method stub
		String palabras[]={"Hi havia una vegada...", "Perquè ho ha fet avui?", "No està malament","Si tu ho dius hi aniré","Doncs d'acord "};
		try {
			PrintStream ps = new PrintStream(temp);
			for(int i=0;i<palabras.length;i++){
				ps.println(palabras[i]);
			}
			ps.println("fi");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
