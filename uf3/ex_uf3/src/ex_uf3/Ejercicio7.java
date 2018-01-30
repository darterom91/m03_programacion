package ex_uf3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File senars = new File("senars.txt");
		File parell = new File("parells.txt");
		try {
			FileReader fr = new FileReader(senars);
			BufferedReader br = new BufferedReader(fr);

			FileReader fr2 = new FileReader(parell);
			BufferedReader br2 = new BufferedReader(fr2);

			String linea = "";
			int cont = 0;
			String[] contenido = null;

			while ((linea = br.readLine()) != null) {
				contenido = linea.split(" ");
			}

			int vSenars[] = new int[contenido.length];

			for (int i = 0; i < contenido.length; i++) {
				vSenars[i] = Integer.parseInt(contenido[i]);
			}

			linea = "";
			while ((linea = br2.readLine()) != null) {
				contenido = linea.split(" ");
			}

			int vParells[] = new int[contenido.length];

			for (int i = 0; i < contenido.length; i++) {
				vParells[i] = Integer.parseInt(contenido[i]);
			}

			int vTotal[] = new int[vSenars.length + vParells.length];
			System.out.println("Senars: "+vSenars.length);
			System.out.println("Parells: "+vParells.length);
			System.out.println("Total: "+vTotal.length);
			for (int i = 0; i < vSenars.length; i++) {
				vTotal[i]=vSenars[i];
			}
			System.out.println("funciona 1");
			for (int i = 0; i < vParells.length; i++) {
				vTotal[50+i]=vParells[i];
			}
			System.out.println("funciona 2");
			
			Arrays.sort(vTotal);
			
			File temp2=new File("100*100.txt");
			PrintStream ps =new PrintStream(temp2);
			for(int i=0;i<vTotal.length;i++){
				ps.print(vTotal[i]+" ");
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
