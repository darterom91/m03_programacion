package Examen;

import java.util.Scanner;

//Practica4 Ej [1] Pregunta examen: 1
//Practica1 Ej [2] Pregunta examen: 2
//Practica1 Ej [2] Pregunta examen: 3
//Practica5 Ej [7] Pregunta examen: 4
//Practica5 Ej [4] Pregunta examen: 5
//Practica1 Ej [1] Pregunta examen: 6
public class Ejercicio1 {
	public static int N = 70;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int j = 00, long_bar = 0;
		String barra[] = new String[10];
		double valor = 0, res, val_max = N;

		for (int i = 0; i < 10; i++) {
			j = 0;
			valor = (int) Math.floor(Math.random() * (70 - 1) + 1);
			System.out.println("El valor es: " + valor);

			long_bar = (int) (70 * (valor / val_max));
			
			barra[i]=long_bar + " | ";
			for (j = 0; j < long_bar; j++) {
				barra[i]+="=";
			}
			System.out.println();
		}
		
		for(int i=0;i<barra.length;i++){
			System.out.println(barra[i]);
		}
	}

}
