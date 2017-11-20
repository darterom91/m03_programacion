package Examen;

import java.util.Scanner;

public class Ejercicio2 {
	public static int N = 10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int vec[] = new int[N], cont = 0, lim=0 ,i = 0, j = 0, option = 0;
		for(i=0;i<vec.length;i++){
			vec[i]=-1;
		}
		
		do {
			do {
				System.out.println("Menu Pila\n"
								+  "---- ----\n"
								+ "1- Introducir en pila.\n"
								+ "2- Sacar de la pila.\n"
								+ "3- Saber si pila es vacia.\n"
								+ "4- Saber si pila es llena. \n"
								+ "5- numero de elementos de la pila. \n"
								+ "6- Mostrar los elementos de la pila. \n"
								+ "0- Salir del programa.\n");
				System.out.print("[: ");
				if (s.hasNextInt()) {
					option = s.nextInt();
					i++;
				} else {
					System.out.println("El valor no es entero...");
					s.next();
				}
			} while (i < 1);
			
			switch(option){
			case 1:
				System.out.println("1- Introducir a la pila:");
				if(lim<vec.length){
					j=0;
					do{
						System.out.println("Intruduce el numero "+lim+": ");
						if(s.hasNextInt()){
							vec[lim]=s.nextInt();
							System.out.println("Numero introducido");
							j++;
						}else{
							System.out.println("El valor no es entero... ");
							s.next();
						}
					}while(j<1);
					lim++;
				}else{
					System.out.println("Pila llena!!!");
				}
				
				System.out.println("pulsa una tecla para continuar: ");
				s.next();
				break;
			case 2:
				System.out.println("2- Sacar de la pila:");
				if(lim>0){
					lim--;
					System.out.println("El numero "+vec[lim]+" fue eliminado...");
					vec[lim]=-1;
					
				}else{
					System.out.println("La pila esta vacia");
				}
				System.out.println("pulsa una tecla para continuar: ");
				s.next();
				break;
			case 3:
				System.out.println("3- Saber si la pila esta vacia:");
				for(i=0;i<vec.length;i++){
					if(vec[i]==-1){
						cont++;
					}
				}
				if(cont==vec.length){
					System.out.println("La pila esta vacia!!");
				}else{
					System.out.println("La pila no esta vacia!!");
				}
				System.out.println("pulsa una tecla para continuar: ");
				s.next();
				break;
			case 4:
				System.out.println("4- Saber si la pila esta llena");
				cont=0;
				for(i=0;i<vec.length;i++){
					if(vec[i]==-1){
						cont++;
					}
				}
				if(cont==0){
					System.out.println("La pila esta llena!!");
				}else{
					System.out.println("La pila no esta llena!!");
				}
				System.out.println("pulsa una tecla para continuar: ");
				s.next();
				break;
			case 5:
				System.out.println("5- Numero de elementos de la pila:");
				cont=0;
				for(i=0;i<vec.length;i++){
					if(vec[i]!=-1){
						cont++;
					}
				}
				System.out.println("El numero de elemento de dentro de la pila es: "+cont);
				System.out.println("pulsa una tecla para continuar: ");
				s.next();
				break;
			case 6:
				System.out.println("6- Mostrar de elementos");
				for(j=0;j<vec.length;j++){
					System.out.print("["+vec[j]+"] ");
				}
				System.out.println("\npulsa una tecla para continuar: ");
				s.next();
				break;
			case 0:
				System.out.println("0- Salir:");
				break;
			default:
				System.out.println("Opcion no valida!");
				System.out.println("pulsa una tecla para continuar: ");
				s.next();
				break;
			}
			
		} while (option != 0);

	}

}
