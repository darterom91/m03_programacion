package ams1_David_Artero_Uf2;

import java.util.Scanner;

public class Ejercicio_04_David_Artero {
	
	public static int N = 10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		menu();
	}

	public static void menu() {
		// TODO Auto-generated method stub
		int option=0;
		do{
			System.out.println("Menu de Ejercicios:\n"
							 + "---- -- -----------\n"
							 + "| 1-  Ejercicio 1 |\n"
							 + "| 2-  Ejercicio 2 |\n"
							 + "| 3-  Ejercicio 3 |\n"
							 + "| 4-  Salir       |\n"
							 + "-------------------");
			option=introOption();
			
			switch(option){
			case 1:
				System.out.println("1-  Ejercicio 1");
				ej1();
				break;
			case 2:
				System.out.println("2-  Ejercicio 2");
				ej2();
				break;
			case 3:
				System.out.println("3-  Ejercicio 3");
				ej3();
				break;
			case 4:
				System.out.println("4-  Salir");
				break;
			default:
				System.out.println("["+option+"] No es una opcion valida...");
				break;
			}
		}while(option!=4);
		
	}

	public static void ej1() {
		// TODO Auto-generated method stub
		int number;
		number = readNumber();
		numberN(number);
	}


	public static int readNumber() {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num = 0, i = 0;
		do {
			System.out.println("Introduce un valor: ");
			if (s.hasNextInt()) {
				num = s.nextInt();
				i++;
			} else {
				System.out.println("El valor no es entero...");
				s.next();
			}
		} while (i < 1);
		return num;
	}

	public static void numberN(int number) {
		// TODO Auto-generated method stub
		for(int i=0;i<number;i++){
			System.out.println("Module executed");
		}
	}

	public static void ej2() {
		// TODO Auto-generated method stub
		   int number1,number2;
	        System.out.println("Introduce el valor I");
	        number1 = readNumber();
	        System.out.println("Introduce el valor II");
	        number2 = readNumber();
	        numberN(number1,number2);   
	}

	public static void numberN(int number1, int number2) {
		// TODO Auto-generated method stub
		int S=0, R=0, M=0;
    	double D=0;
    	S=number1+number2;
    	R=number1-number2;
    	M=number1*number2;
    	D=number1/number2;
    	
    	System.out.println("Suma: "+S);
    	System.out.println("Resta: "+R);
    	System.out.println("Multiplicacion: "+M);
    	System.out.println("Division: "+D);
	}

	public static void ej3() {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
	        int[] box_numbers = new int [N];
	        int quantity_pair,quantity_odd, j=0;
	        for(int i=0;i<box_numbers.length;i++){
	        	System.out.print("Introduce el numero["+i+"]: ");
	        	box_numbers[i] = readNumber();
	        }

	        	System.out.println("pair: "+(quantity_pair=numberN(box_numbers,true)));
	        	System.out.println("odd: "+(quantity_odd=numberN2(box_numbers,false)));
	}

	
	
	 public static int numberN(int[] box_numbers, boolean b) {
	    	int contT=0, contF=0;
			for(int i = 0;i<box_numbers.length;i++){
				if(box_numbers[i]%2==0){
						contT++;	
				}
			}   
			return contT;
	    }

	 public static int numberN2(int[] box_numbers, boolean N) {
	    	int contT=0, contF=0;
			for(int i = 0;i<box_numbers.length;i++){
				if(box_numbers[i]%2!=0){
						contF++;	
				}
			}   
			return contF;
	    }

	public static int introOption() {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int option=0, i=0;
		do{
			System.out.print("Opcion: ");
			if(s.hasNextInt()){
				option=s.nextInt();
				i++;
			}else{
				System.out.println("el valor no es entero...");
				System.out.println();
				s.next();
			}
		}while(i<1);
		return option;
	}

}
