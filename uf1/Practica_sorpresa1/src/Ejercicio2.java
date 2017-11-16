import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int pila[] = new int[10], option = 0, cont = 0, i = 0, lim = 0;
		boolean bol = false;

		do {
			System.out.println("\n\nMenu de la pila: " + "\n1- introducir numeros " + "\n2- mostrar pila "
					+ "\n3- mostrar pila vacia " + "\n4- elementos de la pila " + "\n5- imprimir elementos de la pila "
					+ "\n0- Salir");
			System.out.print(">: ");
			do {
				if (s.hasNextInt()) {
					option = s.nextInt();
					bol = true;
				} else {
					System.out.println("El valor no es entero");
					s.next();
				}
			} while (bol != true);
			switch (option) {
			case 1:
				System.out.println("1- introducir numeros");
				System.out.println("Introduce el numero " + lim + " de la pila: ");
				if (lim < pila.length) {
					if (pila[lim] == 0) {
						do {
							if (s.hasNextInt()) {
								pila[lim] = s.nextInt();
								if (pila[lim] != 0) {
									bol = true;
								} else {
									System.out.println("El valor no puede ser 0");
								}
							} else {
								System.out.println("El valor no es entero...");
								s.next();
							}
						} while (bol != true);
					}
					lim++;
				} else {
					System.out.println("La pila esta llena\n");
				}
				
				break;
			case 2:
				System.out.println("2- Sacar de la pila");
				System.out.println(lim);
				if(lim-1>0) {
					System.out.println("El valor "+pila[lim]+" fue eliminado.");
				pila[lim-1]=0;
				lim--;
				}
				break;
			case 3:
				System.out.println("3- mostrar pila vacia");
				for (i = 0; i < pila.length; i++) {
					if (pila[i] == 0) {
						cont++;
					}
				}
				if (cont == 0) {
					System.out.println("La pila esta vacia");
				} else if (cont != 0) {
					System.out.println("La pila esta en  " + (10-cont));
				} else if (cont == pila.length) {
					System.out.println("La pila esta llena");
				}
				break;

			case 4:
				System.out.println("4- elementos de la pila");
				for (i = 0; i < pila.length; i++) {
					if (pila[i] != 0) {
						cont++;
					}
				}
				break;
			case 5:
				System.out.println("5- imprimir elementos de la pila");
				for (i = 0; i < pila.length; i++) {
					System.out.print("[" + pila[i] + "]");
				}
				System.out.println();
				break;
			case 0:
				System.out.println("0- Salir");
				break;
			default:
				System.out.println("Es opcion no existe");
				break;
			}

		} while (option != 0);
	}

}
