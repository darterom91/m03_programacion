package ams1_david_artero_condicionales;

import java.util.Scanner;

public class ejercicio4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int horaEnt, horaSal, hAux1, res;

			System.out.println("introduce la hora de entrada: ");
			horaEnt = s.nextInt();

			System.out.println("introduce la hora de Salida: ");
			horaSal = s.nextInt();

			if (horaEnt == -1) {
				System.out.println("Saliendo");
			} else {

				if (horaEnt > horaSal) {
					System.out.println("Hora entrada: "+horaEnt);
					System.out.println("Hora salida: "+horaSal);
					hAux1 = horaSal - horaEnt;
					res = hAux1 + 24;
					System.out.println("Horas estacionadas: " + res);

				} else {
					System.out.println("Hora entrada: "+horaEnt);
					System.out.println("Hora salida: "+horaSal);
					hAux1 = horaSal - horaEnt;
					res = hAux1;
					System.out.println("Horas estacionadas: " + res);
				}

				if (res > 0 && res < 2) {
					System.out.println("El precio son 1,5 €");
				} else if (res >= 2) {
					System.out.println("El precio son 2 €");
				}
			}
			
	}
}
