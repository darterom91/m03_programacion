package ex_uf3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ejercicio5 prog = new Ejercicio5();
		prog.inicio();
	}

	public void inicio() {
		// TODO Auto-generated method stub
		File temp = null;
		FileReader fr;
		try {
			temp = new File("doc4.txt");
			fr = new FileReader(temp);
			BufferedReader br = new BufferedReader(fr);
			String lineas = "";
			String personas[]=new String[3];
			String contenido[][] = new String[3][8];
			String nombres[][] = new String[3][3];
			double notas[][] = new double[3][10], media=0;
			int i=0, j=0, cont = 0;

			while ((lineas = br.readLine()) != null) {
				if (!lineas.contains("fi")) {
					System.out.println(lineas + " - cont:" + cont);
					personas[cont] = lineas;
					cont++;
				}
			}
			i = 0;
			while (i < contenido.length) {
				contenido[i] = personas[i].split(" ");
				i++;
			}
			i = 0;
			System.out.println();
			while (i < contenido.length) {
				j = 0;
				while (j < contenido[i].length) {
					if (j < 2) {
						System.out.print(contenido[i][j] + " ");
						nombres[i][j] = contenido[i][j];
					} else if (j >= 2) {
	
						notas[i][j] = Double.parseDouble(contenido[i][j]);
						System.out.print(notas[i][j] + " ");
					}
					j++;
				}
				System.out.println();
				i++;
			}
			
			for(i=0;i<notas.length;i++){
				media=0;
				cont=0;
				for(j=0;j<notas[i].length;j++){
					if(notas[i][j]!=0){
						cont++;
					media+=notas[i][j];
					}
				}
				media/=cont;
				nombres[i][2]=""+media;
				System.out.print(media+" ");
				System.out.println();
			}
			
			for(i=0;i<nombres.length;i++){
				for(j=0;j<nombres[i].length;j++){
					System.out.print(nombres[i][j]+" ");
				}
				System.out.println();
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
