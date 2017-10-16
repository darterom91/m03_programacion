package ams1_david_artero_condicionales2;

import java.util.Scanner;

public class Ejercicio2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int hTrab, hPrecio=30;
		double precioBruto, precioIva, cableM, precioM = 0.5, iva = 1.20, aux;
		
		System.out.println("Introduce las horas trabajadas: ");
		hTrab=s.nextInt();
		
		System.out.println("\nIntroduce los M de cable: ");
		cableM=s.nextDouble();
		
		precioBruto = hTrab * hPrecio;
		aux = cableM * precioM;
		
		precioBruto = precioBruto + aux;
		System.out.println("====================================");
		System.out.println("El precio bruto es: "+precioBruto);
		
		precioIva = precioBruto * iva;
		
		System.out.println("El precio total es: "+precioIva);
		
	}

}
