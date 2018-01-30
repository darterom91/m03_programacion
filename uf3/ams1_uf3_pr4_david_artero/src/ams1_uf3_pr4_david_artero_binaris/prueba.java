package ams1_uf3_pr4_david_artero_binaris;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File temp = new File("ComptaParaulesFitxer.txt");
		try {
			FileReader fr = new FileReader (temp);
			BufferedReader br = new BufferedReader(fr);
			String linea="";
			int cont=0;
			
			while((linea=br.readLine())!=null){
			System.out.println(linea);
			String frases[cont]=linea.split(" ");
			cont++;
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
