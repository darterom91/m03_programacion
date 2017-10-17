package ams1_david_artero_estructures_repetitives;

import java.util.Scanner;

public class Ejercicio1 {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); 
		int option, num1, num2, res;
		double res2;
		
		do {
			System.out.println("Menu de operaciones\n"
							+  "===================\n"
							+ "|1- Suma            |\n"
							+ "|2- Resta           |\n"
							+ "|3- Mutiplicacion   |\n"
							+ "|4- Division        |\n"
							+ "|0- Salir           |\n");
			System.out.print("\n>: ");
			option=s.nextInt();
			
				switch(option) {
				case 1:
					System.out.println("1- Suma");
					System.out.print("\nnum1:");
					num1=s.nextInt();
					System.out.print("\nnum2:");
					num2=s.nextInt();
					res=num1+num2;
					System.out.println(num1+" + "+num2+" = "+res);
					break;
				case 2:
					System.out.println("2- Resta");
					System.out.print("\nnum1:");
					num1=s.nextInt();
					System.out.print("\nnum2:");
					num2=s.nextInt();
					res=num1-num2;
					System.out.println(num1+" - "+num2+" = "+res);
					break;
				case 3:
					System.out.println("3- Multiplicacion");
					System.out.print("\nnum1:");
					num1=s.nextInt();
					System.out.print("\nnum2:");
					num2=s.nextInt();
					res=num1*num2;
					System.out.println(num1+" * "+num2+" = "+res);
					break;
				case 4:
					System.out.println("4- Division");
					System.out.print("\nnum1:");
					num1=s.nextInt();
					System.out.print("\nnum2:");
					num2=s.nextInt();
					res2=num1/num2;
					System.out.println(num1+" / "+num2+" = "+res2);
					break;
				case 0:
					System.out.println("Has salido de la aplicacion");
					break;
				default:
					System.out.println("La opcion es erronea");
					break;
				}
			
		}while(option!=0);
	}
	
}
