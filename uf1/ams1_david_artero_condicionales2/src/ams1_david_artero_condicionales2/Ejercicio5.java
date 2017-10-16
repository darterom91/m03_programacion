package ams1_david_artero_condicionales2;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int horasTrab, precioH;
		double sueldo;
		
		System.out.println("Introduce el numero de horas: ");
		horasTrab=s.nextInt();
		
		System.out.println("Introduce el precio de las horas: ");
		precioH=s.nextInt();
		
		System.out.println("\n================================\n");
		
		if(horasTrab>35){
			sueldo = horasTrab * precioH;
			sueldo = sueldo * 1.5;
			System.out.println("El sueldo con horas extras: "+sueldo);
		}else{
			sueldo = horasTrab * precioH;
			System.out.println("El sueldo sin horas extras: "+sueldo);
		}	
	}
}
