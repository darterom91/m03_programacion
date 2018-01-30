package ex_uf3_david_artero;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ejercicio1 prog = new ejercicio1();
		prog.inicio();
	}

	public void inicio() {
		// TODO Auto-generated method stub
		try {
			FileReader fr = new FileReader("nums.txt");
			BufferedReader br = new BufferedReader(fr);
			String linea;
			int cont=0;
			String nums[];
			
			while ((linea = br.readLine()) != null) {
				if(!linea.equals("fi")) {
				System.out.println("linea numero: "+cont+" = "+linea);
				nums=linea.split(" ");
				for (int i = 0; i < nums.length; i++) {
					if(i%2==0) {
					System.out.println(Integer.parseInt(nums[i])+5);
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
