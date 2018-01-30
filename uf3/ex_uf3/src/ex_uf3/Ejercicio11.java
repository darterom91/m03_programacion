package ex_uf3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String fichero = "";

		System.out.println("Introduce el nombre del fichero: ");
		fichero = s.next();
		if(fichero.isEmpty()){
			fichero="doc4.txt";
		}
		File temp = new File(fichero);
		FileReader fr;
		try {
			fr = new FileReader(temp);
			BufferedReader br = new BufferedReader(fr);
			int letras = br.read();
			String texto = "";
			String []lista=new String[3];
				while (letras != -1) {
					texto = texto + (char) letras;
					letras = br.read();
				}
				lista=texto.split("-1");
				System.out.print(texto);
				System.out.println();
			for(int i=0;i<lista.length;i++){
				if(!lista[i].contains("fi")){
				System.out.print(i+" "+lista[i]);
				}
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
