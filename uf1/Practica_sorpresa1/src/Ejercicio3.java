import java.util.Scanner;

public class Ejercicio3 {
	public static int N = 5;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int pila[] = new int[N], pila2[] = new int[N], option = 0, cont = 0, i = 0, lim = 0;
		boolean bol = false;

		do {
			i = 0;
			do {
				System.out.println("\n\nMenu de la pila: " + "\n1- introducir numeros " + "\n2- Sacar de la pila "
						+ "\n3- mostrar pila vacia " + "\n4- elementos de la pila "
						+ "\n5- imprimir elementos de la pila " + "\n0- Salir");
				System.out.print(">: ");
				if (s.hasNextInt()) {
					option = s.nextInt();
					i++;
				} else {
					System.out.println("El valor no es entero");
					s.next();
				}
			} while (i < 1);

			switch (option) {
			case 1:
				System.out.println("1- introducir numeros");
				System.out.println("Introduce el numero " + lim + " de la pila: ");
				// Mira que lim < pila.length
				if (lim < pila.length) {
					// Si pila[lim] es 0 entonces se entra en el bucle para
					// validar el numero.
					if (pila[lim] == 0) {
						do {
							// Se valida el valor introducido
							if (s.hasNextInt()) {
								pila[lim] = s.nextInt();
								// Se comprueba que el valor !=0, si lo es bol =
								// 0 y se incrementara
								if (pila[lim] != 0) {
									bol = true;
									lim++;
								} else {
									// en caso contrario se informa y se obliga
									// a introducir otro numero
									System.out.println("El valor no puede ser 0");
									System.out.println("Introduce el numero " + lim + " de la pila: ");
								}
							} else {
								System.out.println("El valor no es entero...");
								s.next();
							}
						} while (bol != true);
					}
				} else {
					System.out.println("La pila esta llena\n");
				}
				System.out.println("\nintroduce cualquier caracter para continuar: ");
				s.next();
				break;
			case 2:
				System.out.println("2- Sacar de la pila");
				// comprueba que lim sea mayor a 0 si lo es desincrementa y el
				// valor se le introduce por defecto un 0
				if (lim > 0) {
					lim--;
					System.out.println("El valor " + pila[lim] + " fue eliminado.");
					pila[lim] = 0;
				} else {
					System.out.println("Pila vacia");
				}
				System.out.println("\nintroduce cualquier caracter para continuar: ");
				s.next();
				break;
			case 3:
				System.out.println("3- mostrar pila vacia");
				for (i = 0; i < pila.length; i++) {
					if (pila[i] == 0) {
						cont++;
					}
				}
				// si cont es igual al la long del vector la pila esta vacia,
				// sino muestra
				if (cont == pila.length) {
					System.out.println("La pila esta vacia");
				} else if (cont != 0) {
					System.out.println("La pila esta en  " + (pila.length - cont));
				} else if (cont == 0) {
					System.out.println("La pila esta llena");
				}
				System.out.println("\nintroduce cualquier caracter para continuar: ");
				s.next();
				break;

			case 4:
				System.out.println("4- elementos de la pila");
				cont = 0;
				for (i = 0; i < pila.length; i++) {
					if (pila[i] != 0) {
						cont++;
					}
				}
				System.out.println("La cantidad de elemantos es: " + cont);
				System.out.println("\nintroduce cualquier caracter para continuar: ");
				s.next();
				break;
			case 5:
				System.out.println("5- imprimir elementos de la pila");
				for (i = 0; i < pila.length; i++) {
					System.out.print("[" + pila[i] + "]");
				}
				System.out.println();
				System.out.println("\nintroduce cualquier caracter para continuar: ");
				s.next();
				break;
			case 0:
				System.out.println("0- Salir");
				break;
			default:
				System.out.println("Es opcion no existe");
				System.out.println("\nintroduce cualquier caracter para continuar: ");
				s.next();
				break;
			}
			bol = false;
		} while (option != 0);
		
		for(i=0;i<pila.length;i++){
			System.out.print("["+pila[i]+"]");
		}
		System.out.println();
		for(i=pila.length-1;i>=0;i--){
				pila2[(pila.length-1)-i]=pila[i];
		}
		
		for(i=0;i<pila.length;i++){
			System.out.print("["+pila2[i]+"]");
		}
	}

}
