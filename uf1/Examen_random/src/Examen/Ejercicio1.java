package Examen;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio1 {
	//			1. Practica 1: ej [1]
	//			2. Practica 3: ej [9]
	//			3. Practica 2: ej [2]
	//			4. Practica 4: ej [6]
	//			5. Practica 2: ej [4]
	//			6. Practica 3: ej [2]
	//			7. Practica 2: ej [2]
	//			8. Practica 3: ej [1]
	//			9. Practica 2: ej [1]
	//		   10. Practica 4: ej [6]

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		int horaEnt, i, horaSal = 0, res, precioH=2;
		i=0;
		horaEnt=r.nextInt(23)-1;
		System.out.println("Has entrado a las "+horaEnt);
		do{
			System.out.println("Introduce un numero: ");
			if(s.hasNextInt()){
				horaSal=s.nextInt();
				i++;
			}else{
				System.out.println("Error no es un numero entero");
				s.next();
			}
		}while(i<0);
		
		res = horaSal - horaEnt ;
		System.out.println("res: "+res);
		
		if(horaEnt==23 && horaSal>=0){
			res = horaSal + 1;
		}
		
		if(horaSal<horaEnt){
			res = (23 + res) ; 
		}
		
		System.out.println("Han pasado "+res+" horas...");
		
		if (res<2){
			System.out.println("Pagas: "+precioH);
		}else{
			precioH = precioH * res;
			System.out.println("Pagas: "+precioH);
		}
	}

}
