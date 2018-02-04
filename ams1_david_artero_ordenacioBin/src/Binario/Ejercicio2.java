package Binario;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int vec[] = { 1500, 2060, 3000, 2500, 7000, 4300, 5100, 9200, 6432, 8329, 1002, 1200 };
		int inf = 0, sup = vec.length, med = 0, valor = 0, i = 0, aux=0;
		boolean bol = false;
		
		for(i=0;i<vec.length-1;i++){
			for(int j=i+1;j<vec.length;j++){
				if(vec[i]>vec[j]){
					aux=vec[i];
					vec[i]=vec[j];
					vec[j]=aux;
				}
			}
		}
		for(i=0;i<vec.length;i++){
			System.out.println("mes: "+(i+1)+" ["+vec[i]+"]");
		}
		
		i=0;
		do  {
			System.out.println("Introduce un numero: ");
			if (s.hasNextInt()) {
				valor = s.nextInt();
				i++;
			} else {
				System.out.println("El valor no es entera...");
				s.next();
			}
		}while(i<1);
		
		while (inf<sup && !bol) {
			med = (sup + inf) / 2;
			System.out.println("med: "+med);
			if (vec[med]==valor) {
				bol = true;
			}
			if (valor < vec[med]) {
				sup = med - 1;
				System.out.println("superior: "+sup);
			} else {
				inf = med + 1;
				System.out.println("inferior: "+inf);
			}
		}

		if (bol) {
			System.out.println("\nJuan cobra " + valor + " el mes " +(med+1));
		} else {
			System.out.println("\nJuan No cobra " + valor);
		}
	}

}
