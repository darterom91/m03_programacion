package Binario;

import java.util.Scanner;

public class Ejercicio4 {
	public static int N = 5;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int juan[] = new int[N], pere[] = new int[N], i = 0, j = 0, cont=0, aux;
		int inf = 0, sup = juan.length, med = 0;

		// verificar si es entaro e valor introducido en cada parte del vector
		System.out.println("Juan: ");
		for (i = 0; i < juan.length; i++) {
			System.out.println("introduce el sueldo del mes " + (i + 1) + ": ");
			if (s.hasNextInt()) {
				juan[i] = s.nextInt();

			} else {
				System.out.println("El valor no es entero... ");
				s.next();
				i--;
			}

		}

		// comprobar si hay valores iguales vector a vector
		for (i = 0; i < juan.length - 1; i++) {
			for (j = i + 1; j < juan.length; j++) {
				if (juan[i] == juan[j]) {
					System.out.println(
							"vec[" + i + "] num: " + juan[i] + " = " + "vec[" + j + "] num: " + juan[j] + ": ");
					if (s.hasNextInt()) {
						juan[j] = s.nextInt();
						if (juan[i] != juan[j]) {

						} else {
							System.out.println("El valor sigue siendo igual");
							i--;
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
		// verificar si es entero

		System.out.println("\n\nPere: ");
		for (i = 0; i < pere.length; i++) {
			System.out.println("introduce el sueldo del mes " + (i + 1) + " de pere: ");
			if (s.hasNextInt()) {
				pere[i] = s.nextInt();

			} else {
				System.out.println("El valor no es entero... ");
				s.next();
				i--;
			}

		}

		// Buscar todos los numeros iguales y cambiarlos
		for (i = 0; i < pere.length - 1; i++) {
			for (j = i + 1; j < pere.length; j++) {
				if (pere[i] == pere[j]) {
					System.out.println(
							"vec[" + i + "] num: " + pere[i] + " = " + "vec[" + j + "] num: " + pere[j] + ": ");
					if (s.hasNextInt()) {
						pere[j] = s.nextInt();
						if (pere[i] != pere[j]) {

						} else {
							System.out.println("El valor sigue siendo igual");
							i--;
						}
					} else {
						System.out.println("El valor no es entero... ");
						s.next();
						j--;
					}
				}
			}
		}

		// Mostrar todos los sueldos
		System.out.println("\n\nJuan: ");
		for (j = 0; j < juan.length; j++) {
			System.out.println("vec[" + j + "] num: " + juan[j]);
		}
		System.out.println("\n\nPere: ");
		for (j = 0; j < pere.length; j++) {
			System.out.println("vec[" + j + "] num: " + pere[j]);
		}
		
		//ordenando con burbuja
		for (i = 0; i < juan.length-1; i++) {
			for (j = i+1; j < juan.length; j++) {
				if(juan[i]>juan[j]) {
					aux=juan[i];
					juan[i]=juan[j];
					juan[j]=aux;
				}
			}
		}
		
		for (i = 0; i < pere.length+1; i++) {
			for (j = i+1; j < pere.length; j++) {
				if(pere[i]>pere[j]) {
					aux=pere[i];
					pere[i]=pere[j];
					pere[j]=aux;
				}
			}
		}
		
		System.out.println("\n\nJuan: ");
		for (j = 0; j < juan.length; j++) {
			System.out.println("vec[" + j + "] num: " + juan[j]);
		}
		System.out.println("\n\nPere: ");
		for (j = 0; j < pere.length; j++) {
			System.out.println("vec[" + j + "] num: " + pere[j]);
		}
		
		//cerca binaria
		i=0;
			for (j = 0; j < pere.length; j++) {
				
				med = 0;
				inf = 0;
				sup = i+1;
				while ((inf < sup)) {
					med = (sup + inf) / 2;
					if (pere[med] == juan[j]) {
						if(med==j){
						System.out.println(juan[j] + " = " + pere[med]);
						cont++;
						}
					}
					if (juan[j] < pere[med]) {
						sup = med - 1;
					} else {
						inf = med + 1;
					}
				}
				i++;
			}
			
			System.out.println("La cantidad de meses que cobran lo mismo es: "+cont);

	}

}
