package ams1_david_artero_condicionales;

import java.util.Scanner;

public class ejercicio4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int horaEnt, minEnt;
		int horaSal, minSal, resH, resM;

		System.out.println("introduce la hora de entrada: ");
		horaEnt = s.nextInt();
		// System.out.println("minutos: ");
		// minEnt=s.nextInt();

		System.out.println("entro a las " + horaEnt);

		System.out.println("la hora de salida: ");
		horaSal = s.nextInt();
		// System.out.println("minutos: ");
		// minSal=s.nextInt();
		resH = horaEnt - horaSal;
		// resM=minEnt - minSal;
		if (horaEnt <= 23 && horaSal >= 0) {
			resH = horaSal + 1;
		}
		resH = resH * 1;

		if (resH < 0) {
			resH = -resH * -1;
			System.out.println("la hora de salida: " + resH);
		} else {
			System.out.println("la hora de salida: " + resH);
		}

		// if(resM<0){
		// resM=-resM*-1;
		// System.out.println("los minutos de salida: "+resM);
		// }else{
		// resM=resM*-1;
		// System.out.println("los minutos de salida: "+resM);
		// }

		if (resH > 0 && resH < 2) {
			System.out.println("El precio son 1,5 €");
		} else if (resH >= 2) {
			System.out.println("El precio son 2 €");
		}
	}
}
