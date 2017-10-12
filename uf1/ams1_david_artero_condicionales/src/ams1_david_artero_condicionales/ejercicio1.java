package ams1_david_artero_condicionales;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		double notas;
		String nom;
		System.out.print("introduce el nombre: ");
		nom=s.next();
		
		do{
		System.out.print("Introduce la nota: ");
		notas=s.nextDouble();
			if(notas<5){
				System.out.println("\nLa nota de "+nom+" es un insuficiente");
				System.out.println("[suspendido]");
			}else if(notas>5&&notas<6.5){
				System.out.println("\nLa nota de "+nom+" es un bien");
				System.out.println("[aprobado]");
			}else if(notas>=6.5&&notas<8.5){
				System.out.println("\nLa nota de "+nom+" es un notable");
				System.out.println("[aprobado]");
			}else if(notas>=8.5&&notas<=10){
				System.out.println("\nLa nota de "+nom+" es un excelente");
				System.out.println("[aprobado]");
			}
			System.out.println("\nSi insertas un 0 se acaba la ejecucion");
		}while(notas!=0);

	}

}
