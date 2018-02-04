package Binario;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int vec[] = new int[10], aux, inf = 0, sup = vec.length, med = 0, i = 0, j = 0;
		// validador de numeros enteros
		// for ( i = 0; i < vec.length; i++) {
		// System.out.println("Introduce el numero " + i + " del vector: ");
		// if (s.hasNextInt()) {
		// vec[i] = s.nextInt();
		// } else {
		// System.out.println("El valor no es entero");
		// s.next();
		// i--;
		// }
		// }
		while (i < vec.length) {
			System.out.println("introduce el numero: " + i);
			j = 0;
			if (s.hasNextInt()) {
				vec[i] = s.nextInt();
				if (vec[i] == vec[j]) {
					while (j < i) {
						System.out.println("son iguales introduce el numero: " + j);
						if (s.hasNextInt()) {
							vec[j] = s.nextInt();
							if (vec[i] != vec[j]) {
								j++;
							}
						} else {
							System.out.println("Valor no entero...");
							s.next();
						}
					}
				}
				i++;
			} else {
				System.out.println("Valor no entero...");
				s.next();
			}
		}

		// ordenacion de tipo burbuja
		for (i = 0; i < vec.length - 1; i++) {
			for (j = i + 1; j < vec.length; j++) {
				if (vec[i] > vec[j]) {
					aux = vec[i];
					vec[i] = vec[j];
					vec[j] = aux;
				}
			}
		}
		// Mostrar los valores ordenados.
		for (j = 0; j < vec.length; j++) {
			System.out.println("vec[" + j + "]: " + vec[j]);
		}

		// Comprobar cada posicion de el vector y compararlo
		// con las demas posiciones seria como una burbuja, pero buscando
		// valores iguales.
		for (i = 0; i < vec.length - 1; i++) {
			for (j = i + 1; j < vec.length; j++) {
				if (vec[i] == vec[j]) {
					System.out.println("vec[" + i + "] num: " + vec[i] + " = " + "vec[" + j + "] num: " + vec[j]);
					if (s.hasNextInt()) {
						vec[j] = s.nextInt();
						if (vec[i] != vec[j]) {// Mira si el valor nuevo
												// introducido es diferente al
												// valor de i.

						} else {
							System.out.println("El numero sigue siendo igual...");// resta
																					// el
																					// valor
																					// de
																					// la
																					// j
																					// para
																					// no
																					// avanzar
																					// el
																					// bucle.

							j--;
						}
					} else {
						System.out.println("El valor no es entero... ");
						s.next();
						j--;
					}
				}
			}
		}
		// Muestra los valores del vector, con los numeros diferentes
		for (j = 0; j < vec.length; j++) {
			System.out.println("vec[" + j + "]: " + vec[j]);
		}
	}

}
