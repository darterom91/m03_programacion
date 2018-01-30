package ex_uf3_david_artero;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;

public class ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ejercicio2 prog = new ejercicio2();
		prog.inicio();
	}

	private void inicio() {
		// TODO Auto-generated method stub
		try {
			File temp = new File("coches.txt");
			FileReader fr = new FileReader(temp);
			BufferedReader br = new BufferedReader(fr);
			String linea;
			int cont = 0;
			String coches[] = null;

			File BENZINA = new File("BENZINA.txt");
			PrintStream be = new PrintStream(BENZINA);
			File DIESEL = new File("DIESEL.txt");
			PrintStream di = new PrintStream(DIESEL);
			File ELECTRIC = new File("ELECTRIC.txt");
			PrintStream el = new PrintStream(ELECTRIC);
			int sum1=0, sum2=0 ,sum3=0, contY=0;
			
			while ((linea = br.readLine()) != null) {
				if (!linea.equalsIgnoreCase("fi")) {
					System.out.println("linea numero: " + cont + " = " + linea);
					coches = linea.split(" ");
					contY=0;
					if(coches[5].equalsIgnoreCase("BENZINA")) {
						sum1=0;
							for (int i = 6; !coches[i].equals("-1"); i++) {
								System.out.println("sum1: "+sum1+" y: "+contY);
								contY=i;
								sum1++;
							}
							if(sum1>0) {
							be.println(coches[0]+coches[1]+coches[2]+coches[3]+coches[4]+coches[5]+"num revison: "+sum1+" last: "+(coches[contY]));
							}else {
								be.println(coches[0]+coches[1]+coches[2]+coches[3]+coches[4]+coches[5]+"num revison: "+sum1+" last: ");
							}
					}
					contY=0;
					if(coches[5].equalsIgnoreCase("DIESEL")) {
						sum2=0;
							for (int i = 6; !coches[i].equals("-1"); i++) {
								System.out.println("sum2: "+sum2+"y: "+contY);
								contY=i;
								sum2++;	
							}
							if(sum2>0) {
								di.println(coches[0]+coches[1]+coches[2]+coches[3]+coches[4]+coches[5]+"num revison: "+sum2+" last: "+(coches[contY]));
								}else {
									di.println(coches[0]+coches[1]+coches[2]+coches[3]+coches[4]+coches[5]+"num revison: "+sum2+" last: ");
								}
					}
					contY=0;
					if(coches[5].equalsIgnoreCase("ELECTRIC")) {
						sum3=0;
							for (int i = 6; !coches[i].equals("-1"); i++) {
								System.out.println("sum3: "+sum3+"y: "+contY);
								contY=i;
								sum3++;
							}
							System.out.println(sum3);
							if(sum3>0) {
								el.println(coches[0]+coches[1]+coches[2]+coches[3]+coches[4]+coches[5]+"num revison: "+sum3+" last: "+(coches[contY]));
								}else {
									el.println(coches[0]+coches[1]+coches[2]+coches[3]+coches[4]+coches[5]+"num revison: "+sum3+" last: ");
								}
					}
					cont++;
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
