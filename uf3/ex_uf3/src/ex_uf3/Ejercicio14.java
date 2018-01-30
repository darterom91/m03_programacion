package ex_uf3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Ejercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File carta = new File("doc0.txt");
			FileReader fr = new FileReader(carta);
			BufferedReader br = new BufferedReader(fr);

			int contCar = 0, contPal = 0, contLineas = 0;
			int c = br.read();

			while (c != -1) {
				if ((char) c == ' ') {
					contCar++;
					contPal++;
				} else {
					if ((char) c == '\n') {
						contPal++;
						contLineas++;
					} else {
						contCar++;
					}
				}
				c = br.read();
			}
			
			if(contPal>0){
				contPal++;
			}
			
			if(contLineas>0){
				contLineas++;
			}

			System.out.println("Caracteres: " + contCar);
			System.out.println("Palabras: " + contPal);
			System.out.println("Lineas: " + contLineas);

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
