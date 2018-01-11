package ams1_David_Artero_Uf2;

import java.util.Scanner;

public class ams1_David_Artero_Uf2_pr4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		menu();
	}

	public static void menu() {
		// TODO Auto-generated method stub
		int option=0, num1=0, num2=0, res=0;
		do{
			System.out.println("Menu de Ejercicios:\n"
							+  "---- -- -----------\n"
							+  "1- Ejercicio 1 \n"
							+  "2- Ejercicio 2 \n"
							+  "3- Ejercicio 3 \n"
							+  "4- Ejercicio 4 \n"
							+  "5- Salir \n"
							+  "-------------------\n");
			option=introOption();
			switch(option){
			case 1:
				System.out.println("1- Ejercicio 1");
				
				System.out.println("Introduce el numero 1:");
				num1=introOption();
				
				System.out.println("Introduce el numero 2:");
				num2=introOption();
				
				System.out.println("El resultado: "+sumaRecursiva(num1, num2));
				
				break;
			case 2:
				System.out.println("2- Ejercicio 2");
				System.out.println("Introduce un numero: ");
				num1=introOption();
				System.out.println(num1+ " cambia a: "+invertir(num1, num2));
				break;
			case 3:
				System.out.println("3- Ejercicio 3");
				System.out.println("Introduce un numero: ");
				num1=introOption();		
				System.out.println(num1+" es positivo? "+positivo(num1));
				break;
			case 4:
				System.out.println("4- Ejercicio 4");
				System.out.println("Numero de discos: ");
			        num1=introOption();
			        Hanoi(num1,1,2,3);
				break;
			case 5:
				System.out.println("5- Salir");
				break;
			default:
				System.out.println("La opcion no es valida");
				break;
			}
		}while(option!=5);
	}

		//Método Torres de Hanoi Recursivo
		public static void Hanoi(int n, int origen,  int auxiliar, int destino){
		  if(n==1)
		  System.out.println("mover disco de " + origen + " a " + destino);
		  else{
		     Hanoi(n-1, origen, destino, auxiliar);
		     System.out.println("mover disco de "+ origen + " a " + destino);
		     Hanoi(n-1, auxiliar, origen, destino);
		   }
		}
	
	public static int invertir(int n,int m) {
	      int invertido;
	      if (n == 0) {
	         invertido = m;
	      } else {
	         invertido = invertir(n / 10, m * 10 + n % 10);
	      }
	      return invertido;
	   }



	public static boolean positivo(int num1) {
		// TODO Auto-generated method stub
		if(num1>0)
			return true;
		else if(num1<0)
			return false;
		else
			   return  positivo(num1);		  
	}
	
	 
	public static int sumaRecursiva(int num1, int num2) {
		// TODO Auto-generated method stub
		if (num2 == 0){
			return num1;
		}
		System.out.println(1 + sumaRecursiva(num1, num2-1));
		return 1 + sumaRecursiva(num1, num2-1);
	}

	public static int introOption() {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int option=0, i=0;
		do{
			if(s.hasNextInt()){
				option=s.nextInt();
				i++;
			}else{
				System.out.println("El valor no es entero...");
				s.next();
			}
		}while(i<1);
		return option;
	}

}
